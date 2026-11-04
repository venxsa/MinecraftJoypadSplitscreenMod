    protected boolean meetsThreshold() {
        float reading = getAnalogReading();
        if (Float.isNaN(reading) || Float.isInfinite(reading)) {
            return false;
        }

        if (threshold > 0) {
            return reading >= threshold;
        }

        // Some controllers report trigger axes with an inverted or shifted polarity,
        // especially when a single-direction axis is normalized to 0..1 or -1..1.
        // Treat a negative threshold as a magnitude-triggered condition so attack/use
        // continue to work across controller families and remapped axes.
        return reading <= threshold || reading >= Math.abs(threshold);
    }
