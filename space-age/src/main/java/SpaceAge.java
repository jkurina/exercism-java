class SpaceAge {
    // See https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
    private final double seconds;
    private enum Planet {
        EARTH (31557600),
        MERCURY (0.2408467),
        VENUS (0.61519726),
        MARS (1.8808158),
        JUPITER (11.862615),
        SATURN (29.447498),
        URANUS (84.016846),
        NEPTUNE (164.79132);
        
        private final double relativeToEarth;
        
        Planet ( double x ) {
            this.relativeToEarth = x;
        }
        
        private final double relativeToEarth() {
            return this.relativeToEarth;
        }
    }

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return getSeconds() / Planet.EARTH.relativeToEarth();
    }

    double onMercury() {
        return onEarth() / Planet.MERCURY.relativeToEarth();
    }

    double onVenus() {
        return onEarth() / Planet.VENUS.relativeToEarth();
    }

    double onMars() {
        return onEarth() / Planet.MARS.relativeToEarth();
    }

    double onJupiter() {
        return onEarth() / Planet.JUPITER.relativeToEarth();
    }

    double onSaturn() {
        return onEarth() / Planet.SATURN.relativeToEarth();
    }

    double onUranus() {
        return onEarth() / Planet.URANUS.relativeToEarth();
    }

    double onNeptune() {
        return onEarth() / Planet.NEPTUNE.relativeToEarth();
    }

}
