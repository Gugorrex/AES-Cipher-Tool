package de.gugorrex.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.util.Supplier;

public abstract class CleanParamsLogger implements Logger {
    @Override
    public void log(Level level, Marker marker, String message, Object... params) {
        logObjectParams(level, marker, message, params);
    }

    protected abstract void logObjectParams(Level level, Marker marker, String message, Object... params);

    @Override
    public void log(Level level, Marker marker, String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(level, marker, message, paramSuppliers);
    }

    protected abstract void logSupplierParams(Level level, Marker marker, String message, Supplier<?>... paramSuppliers);

    @Override
    public void log(Level level, String message, Object... params) {
        logObjectParams(level, message, params);
    }

    protected abstract void logObjectParams(Level level, String message, Object... params);

    @Override
    public void log(Level level, String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(level, message, paramSuppliers);
    }

    protected abstract void logSupplierParams(Level level, String message, Supplier<?>... paramSuppliers);

    @Override
    public void log(Level level, Marker marker, String message, Object p0) {
        logObjectParams(level, marker, message, p0);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1) {
        logObjectParams(level, marker, message, p0, p1);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2) {
        logObjectParams(level, marker, message, p0, p1, p2);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        logObjectParams(level, marker, message, p0, p1, p2, p3);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        logObjectParams(level, marker, message, p0, p1, p2, p3, p4);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        logObjectParams(level, marker, message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        logObjectParams(level, marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        logObjectParams(level, marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        logObjectParams(level, marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        logObjectParams(level, marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void log(Level level, String message, Object p0) {
        logObjectParams(level, message, p0);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1) {
        logObjectParams(level, message, p0, p1);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2) {
        logObjectParams(level, message, p0, p1, p2);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3) {
        logObjectParams(level, message, p0, p1, p2, p3);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        logObjectParams(level, message, p0, p1, p2, p3, p4);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        logObjectParams(level, message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        logObjectParams(level, message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        logObjectParams(level, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        logObjectParams(level, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        logObjectParams(level, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void debug(Marker marker, String message, Object... params) {
        debugObjectParams(marker, message, params);
    }

    protected void debugObjectParams(Marker marker, String message, Object... params) {
        logObjectParams(Level.DEBUG, marker, message, params);
    }

    @Override
    public void debug(Marker marker, String message, Supplier<?>... paramSuppliers) {
        debugSupplierParams(marker, message, paramSuppliers);
    }

    protected void debugSupplierParams(Marker marker, String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.DEBUG, marker, message, paramSuppliers);
    }

    @Override
    public void debug(String message, Object... params) {
        debugObjectParams(message, params);
    }

    protected void debugObjectParams(String message, Object... params) {
        logObjectParams(Level.DEBUG, message, params);
    }

    @Override
    public void debug(String message, Supplier<?>... paramSuppliers) {
        debugSupplierParams(message, paramSuppliers);
    }

    protected void debugSupplierParams(String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.DEBUG, message, paramSuppliers);
    }

    @Override
    public void debug(Marker marker, String message, Object p0) {
        debugObjectParams(marker, message, p0);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1) {
        debugObjectParams(marker, message, p0, p1);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2) {
        debugObjectParams(marker, message, p0, p1, p2);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        debugObjectParams(marker, message, p0, p1, p2, p3);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        debugObjectParams(marker, message, p0, p1, p2, p3, p4);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        debugObjectParams(marker, message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        debugObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        debugObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        debugObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        debugObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void debug(String message, Object p0) {
        debugObjectParams(message, p0);
    }

    @Override
    public void debug(String message, Object p0, Object p1) {
        debugObjectParams(message, p0, p1);
    }

    @Override
    public void debug(String message, Object p0, Object p1, Object p2) {
        debugObjectParams(message, p0, p1, p2);
    }

    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3) {
        debugObjectParams(message, p0, p1, p2, p3);
    }

    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        debugObjectParams(message, p0, p1, p2, p3, p4);
    }

    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        debugObjectParams(message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        debugObjectParams(message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        debugObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        debugObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        debugObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void info(Marker marker, String message, Object... params) {
        infoObjectParams(marker, message, params);
    }

    protected void infoObjectParams(Marker marker, String message, Object... params) {
        logObjectParams(Level.INFO, marker, message, params);
    }

    @Override
    public void info(Marker marker, String message, Supplier<?>... paramSuppliers) {
        infoSupplierParams(marker, message, paramSuppliers);
    }

    protected void infoSupplierParams(Marker marker, String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.INFO, marker, message, paramSuppliers);
    }

    @Override
    public void info(String message, Object... params) {
        infoObjectParams(message, params);
    }

    protected void infoObjectParams(String message, Object... params) {
        logObjectParams(Level.INFO, message, params);
    }

    @Override
    public void info(String message, Supplier<?>... paramSuppliers) {
        infoSupplierParams(message, paramSuppliers);
    }

    protected void infoSupplierParams(String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.INFO, message, paramSuppliers);
    }

    @Override
    public void info(Marker marker, String message, Object p0) {
        infoObjectParams(marker, message, p0);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1) {
        infoObjectParams(marker, message, p0, p1);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2) {
        infoObjectParams(marker, message, p0, p1, p2);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        infoObjectParams(marker, message, p0, p1, p2, p3);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        infoObjectParams(marker, message, p0, p1, p2, p3, p4);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        infoObjectParams(marker, message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        infoObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        infoObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        infoObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        infoObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void info(String message, Object p0) {
        infoObjectParams(message, p0);
    }

    @Override
    public void info(String message, Object p0, Object p1) {
        infoObjectParams(message, p0, p1);
    }

    @Override
    public void info(String message, Object p0, Object p1, Object p2) {
        infoObjectParams(message, p0, p1, p2);
    }

    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3) {
        infoObjectParams(message, p0, p1, p2, p3);
    }

    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        infoObjectParams(message, p0, p1, p2, p3, p4);
    }

    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        infoObjectParams(message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        infoObjectParams(message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        infoObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        infoObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        infoObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void trace(Marker marker, String message, Object... params) {
        traceObjectParams(marker, message, params);
    }

    protected void traceObjectParams(Marker marker, String message, Object... params) {
        logObjectParams(Level.TRACE, marker, message, params);
    }

    @Override
    public void trace(Marker marker, String message, Supplier<?>... paramSuppliers) {
        traceSupplierParams(marker, message, paramSuppliers);
    }

    protected void traceSupplierParams(Marker marker, String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.TRACE, marker, message, paramSuppliers);
    }

    @Override
    public void trace(String message, Object... params) {
        traceObjectParams(message, params);
    }

    protected void traceObjectParams(String message, Object... params) {
        logObjectParams(Level.TRACE, message, params);
    }

    @Override
    public void trace(String message, Supplier<?>... paramSuppliers) {
        traceSupplierParams(message, paramSuppliers);
    }

    protected void traceSupplierParams(String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.TRACE, message, paramSuppliers);
    }

    @Override
    public void trace(Marker marker, String message, Object p0) {
        traceObjectParams(marker, message, p0);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1) {
        traceObjectParams(marker, message, p0, p1);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2) {
        traceObjectParams(marker, message, p0, p1, p2);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        traceObjectParams(marker, message, p0, p1, p2, p3);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        traceObjectParams(marker, message, p0, p1, p2, p3, p4);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        traceObjectParams(marker, message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        traceObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        traceObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        traceObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        traceObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void trace(String message, Object p0) {
        traceObjectParams(message, p0);
    }

    @Override
    public void trace(String message, Object p0, Object p1) {
        traceObjectParams(message, p0, p1);
    }

    @Override
    public void trace(String message, Object p0, Object p1, Object p2) {
        traceObjectParams(message, p0, p1, p2);
    }

    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3) {
        traceObjectParams(message, p0, p1, p2, p3);
    }

    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        traceObjectParams(message, p0, p1, p2, p3, p4);
    }

    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        traceObjectParams(message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        traceObjectParams(message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        traceObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        traceObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        traceObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void error(Marker marker, String message, Object... params) {
        errorObjectParams(marker, message, params);
    }

    protected void errorObjectParams(Marker marker, String message, Object... params) {
        logObjectParams(Level.ERROR, marker, message, params);
    }

    @Override
    public void error(Marker marker, String message, Supplier<?>... paramSuppliers) {
        errorSupplierParams(marker, message, paramSuppliers);
    }

    protected void errorSupplierParams(Marker marker, String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.ERROR, marker, message, paramSuppliers);
    }

    @Override
    public void error(String message, Object... params) {
        errorObjectParams(message, params);
    }

    protected void errorObjectParams(String message, Object... params) {
        logObjectParams(Level.ERROR, message, params);
    }

    @Override
    public void error(String message, Supplier<?>... paramSuppliers) {
        errorSupplierParams(message, paramSuppliers);
    }

    protected void errorSupplierParams(String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.ERROR, message, paramSuppliers);
    }

    @Override
    public void error(Marker marker, String message, Object p0) {
        errorObjectParams(marker, message, p0);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1) {
        errorObjectParams(marker, message, p0, p1);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2) {
        errorObjectParams(marker, message, p0, p1, p2);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        errorObjectParams(marker, message, p0, p1, p2, p3);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        errorObjectParams(marker, message, p0, p1, p2, p3, p4);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        errorObjectParams(marker, message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        errorObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        errorObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        errorObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        errorObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void error(String message, Object p0) {
        errorObjectParams(message, p0);
    }

    @Override
    public void error(String message, Object p0, Object p1) {
        errorObjectParams(message, p0, p1);
    }

    @Override
    public void error(String message, Object p0, Object p1, Object p2) {
        errorObjectParams(message, p0, p1, p2);
    }

    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3) {
        errorObjectParams(message, p0, p1, p2, p3);
    }

    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        errorObjectParams(message, p0, p1, p2, p3, p4);
    }

    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        errorObjectParams(message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        errorObjectParams(message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        errorObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        errorObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        errorObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void fatal(Marker marker, String message, Object... params) {
        fatalObjectParams(marker, message, params);
    }

    protected void fatalObjectParams(Marker marker, String message, Object... params) {
        logObjectParams(Level.FATAL, marker, message, params);
    }

    @Override
    public void fatal(Marker marker, String message, Supplier<?>... paramSuppliers) {
        fatalSupplierParams(marker, message, paramSuppliers);
    }

    protected void fatalSupplierParams(Marker marker, String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.FATAL, marker, message, paramSuppliers);
    }

    @Override
    public void fatal(String message, Object... params) {
        fatalObjectParams(message, params);
    }

    protected void fatalObjectParams(String message, Object... params) {
        logObjectParams(Level.FATAL, message, params);
    }

    @Override
    public void fatal(String message, Supplier<?>... paramSuppliers) {
        fatalSupplierParams(message, paramSuppliers);
    }

    protected void fatalSupplierParams(String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.FATAL, message, paramSuppliers);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0) {
        fatalObjectParams(marker, message, p0);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1) {
        fatalObjectParams(marker, message, p0, p1);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2) {
        fatalObjectParams(marker, message, p0, p1, p2);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        fatalObjectParams(marker, message, p0, p1, p2, p3);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        fatalObjectParams(marker, message, p0, p1, p2, p3, p4);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        fatalObjectParams(marker, message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        fatalObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        fatalObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        fatalObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        fatalObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void fatal(String message, Object p0) {
        fatalObjectParams(message, p0);
    }

    @Override
    public void fatal(String message, Object p0, Object p1) {
        fatalObjectParams(message, p0, p1);
    }

    @Override
    public void fatal(String message, Object p0, Object p1, Object p2) {
        fatalObjectParams(message, p0, p1, p2);
    }

    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3) {
        fatalObjectParams(message, p0, p1, p2, p3);
    }

    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        fatalObjectParams(message, p0, p1, p2, p3, p4);
    }

    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        fatalObjectParams(message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        fatalObjectParams(message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        fatalObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        fatalObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        fatalObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void warn(Marker marker, String message, Object... params) {
        warnObjectParams(marker, message, params);
    }

    protected void warnObjectParams(Marker marker, String message, Object... params) {
        logObjectParams(Level.WARN, marker, message, params);
    }

    @Override
    public void warn(Marker marker, String message, Supplier<?>... paramSuppliers) {
        warnSupplierParams(marker, message, paramSuppliers);
    }

    protected void warnSupplierParams(Marker marker, String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.WARN, marker, message, paramSuppliers);
    }

    @Override
    public void warn(String message, Object... params) {
        warnObjectParams(message, params);
    }

    protected void warnObjectParams(String message, Object... params) {
        logObjectParams(Level.WARN, message, params);
    }

    @Override
    public void warn(String message, Supplier<?>... paramSuppliers) {
        warnSupplierParams(message, paramSuppliers);
    }

    protected void warnSupplierParams(String message, Supplier<?>... paramSuppliers) {
        logSupplierParams(Level.WARN, message, paramSuppliers);
    }

    @Override
    public void warn(Marker marker, String message, Object p0) {
        warnObjectParams(marker, message, p0);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1) {
        warnObjectParams(marker, message, p0, p1);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2) {
        warnObjectParams(marker, message, p0, p1, p2);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
        warnObjectParams(marker, message, p0, p1, p2, p3);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        warnObjectParams(marker, message, p0, p1, p2, p3, p4);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        warnObjectParams(marker, message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        warnObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        warnObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        warnObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        warnObjectParams(marker, message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override
    public void warn(String message, Object p0) {
        warnObjectParams(message, p0);
    }

    @Override
    public void warn(String message, Object p0, Object p1) {
        warnObjectParams(message, p0, p1);
    }

    @Override
    public void warn(String message, Object p0, Object p1, Object p2) {
        warnObjectParams(message, p0, p1, p2);
    }

    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3) {
        warnObjectParams(message, p0, p1, p2, p3);
    }

    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
        warnObjectParams(message, p0, p1, p2, p3, p4);
    }

    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
        warnObjectParams(message, p0, p1, p2, p3, p4, p5);
    }

    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
        warnObjectParams(message, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
        warnObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
        warnObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
        warnObjectParams(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
}
