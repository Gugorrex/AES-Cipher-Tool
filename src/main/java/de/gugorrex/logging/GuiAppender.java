package de.gugorrex.logging;

import org.apache.logging.log4j.core.*;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.appender.AppenderLoggingException;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

import javax.swing.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Plugin(
    name = "GuiAppender",
    category = Core.CATEGORY_NAME,
    elementType = Appender.ELEMENT_TYPE,
    printObject = true
)
public class GuiAppender extends AbstractAppender {

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();

    protected GuiAppender(String name, Filter filter, Layout<? extends Serializable> layout,
                          final boolean ignoreExceptions) {
        super(name, filter, layout, ignoreExceptions, null);
        LOGGER.info("GuiAppender is instantiated..");
    }

    @PluginFactory
    public static GuiAppender createAppender(@PluginAttribute("name") String name,
                                              @PluginElement("Layout") Layout<? extends Serializable> layout,
                                              @PluginElement("Filter") final Filter filter, @PluginAttribute("otherAttribute") String otherAttribute) {
        if (name == null) {
            LOGGER.error("There is no name provided for MyCustomAppender");
            return null;
        }
        if (layout == null) {
            layout = PatternLayout.createDefaultLayout();
        }
        return new GuiAppender(name, filter, layout, true);

    }

    @Override
    public void append(LogEvent logEvent) {
        readLock.lock();
        try {
            String logMsg = logEvent.getMessage().getFormattedMessage();
            JOptionPane.showOptionDialog(null, logMsg,
                    "GUI Log Output", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, new String[]{"ok"}, "ok");
        } catch (Exception ex) {
            if (!ignoreExceptions()) {
                throw new AppenderLoggingException(ex);
            }
        } finally {
            readLock.unlock();
        }
    }
}
