package acmi.android.jul;

import android.util.Log;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class AndroidLogHandler extends Handler {
    private static final Formatter FORMATTER = new Formatter() {
        @Override
        public String format(LogRecord record) {
            String message = record.getMessage();
            //noinspection ThrowableResultOfMethodCallIgnored
            if (record.getThrown() != null)
                message += '\n' + Log.getStackTraceString(record.getThrown());
            return message;
        }
    };

    {
        setFormatter(FORMATTER);
    }

    @Override
    public void publish(final LogRecord record) {
        Log.println(getLogPriority(record.getLevel()), record.getLoggerName(), getFormatter().format(record));
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    private static int getLogPriority(Level level) {
        int value = level.intValue();
        if (value >= Level.SEVERE.intValue()) {
            return Log.ERROR;
        } else if (value >= Level.WARNING.intValue()) {
            return Log.WARN;
        } else if (value >= Level.INFO.intValue()) {
            return Log.INFO;
        } else if (value >= Level.CONFIG.intValue()) {
            return Log.DEBUG;
        } else {
            return Log.VERBOSE;
        }
    }
}
