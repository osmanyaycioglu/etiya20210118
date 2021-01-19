package com.training.etiya.java.enums;


public enum TimeConvert {

    MILIS() {

        @Override
        public long convert(final long val) {
            return val;
        }
    },
    SECOND() {

        @Override
        public long convert(final long val) {
            return val * 1000;
        }
    },
    MINUTE() {

        @Override
        public long convert(final long val) {
            return SECOND.convert(val * 60);
        }
    },
    HOUR() {

        @Override
        public long convert(final long val) {
            return MINUTE.convert(val * 60);
        }
    },
    DAY() {

        @Override
        public long convert(final long val) {
            return HOUR.convert(val * 24);
        }
    };

    public long convert(final long val) {
        throw new NullPointerException();
    }
}
