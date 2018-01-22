package misc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    static private boolean torus;
    static private int gridSizeX;
    static private int gridSizeY;
    static private int canvasSizeX;
    static private int canvasSizeY;
    static private int boxSize;
    static private int delay;
    static private String scheduling;
    static private int nbTicks;
    static private boolean grid;
    static private boolean trace;
    static private long seed;
    static private int refresh;
    static private int nbParticles;
    static private String particleType;

    static public void load() {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("config.properties");
            prop.load(input);

            torus = Boolean.parseBoolean(prop.getProperty("torus"));
            gridSizeX = Integer.parseInt(prop.getProperty("gridSizeX"));
            gridSizeY = Integer.parseInt(prop.getProperty("gridSizeY"));
            canvasSizeX = Integer.parseInt(prop.getProperty("canvasSizeX"));
            canvasSizeY = Integer.parseInt(prop.getProperty("canvasSizeY"));
            boxSize = Integer.parseInt(prop.getProperty("boxSize"));
            delay = Integer.parseInt(prop.getProperty("delay"));
            scheduling = prop.getProperty("scheduling");
            nbTicks = Integer.parseInt(prop.getProperty("nbTicks"));
            grid = Boolean.parseBoolean(prop.getProperty("grid"));
            trace = Boolean.parseBoolean(prop.getProperty("trace"));
            seed = Long.parseLong(prop.getProperty("seed"));
            refresh = Integer.parseInt(prop.getProperty("refresh"));
            nbParticles = Integer.parseInt(prop.getProperty("nbParticles"));
            particleType = prop.getProperty("particleType");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static public boolean isTorus() {
        return torus;
    }

    static public void setTorus(boolean t) {
        torus = t;
    }

    static public int getGridSizeX() {
        return gridSizeX;
    }

    static public void setGridSizeX(int gsx) {
        gridSizeX = gsx;
    }

    static public int getGridSizeY() {
        return gridSizeY;
    }

    static public void setGridSizeY(int gsy) {
        gridSizeY = gsy;
    }

    static public int getCanvasSizeX() {
        return canvasSizeX;
    }

    static public void setCanvasSizeX(int csx) {
        canvasSizeX = csx;
    }

    static public int getCanvasSizeY() {
        return canvasSizeY;
    }

    static public void setCanvasSizeY(int csy) {
        canvasSizeY = csy;
    }

    static public int getBoxSize() {
        return boxSize;
    }

    static public void setBoxSize(int bs) {
        boxSize = bs;
    }

    static public int getDelay() {
        return delay;
    }

    static public void setDelay(int d) {
        delay = d;
    }

    static public String getScheduling() {
        return scheduling;
    }

    static public void setScheduling(String s) {
        scheduling = s;
    }

    static public int getNbTicks() {
        return nbTicks;
    }

    static public void setNbTicks(int nt) {
        nbTicks = nt;
    }

    static public boolean isGrid() {
        return grid;
    }

    static public void setGrid(boolean g) {
        grid = g;
    }

    static public boolean isTrace() {
        return trace;
    }

    static public void setTrace(boolean tr) {
        trace = tr;
    }

    static public long getSeed() {
        return seed;
    }

    static public void setSeed(long s) {
        seed = s;
    }

    static public int getRefresh() {
        return refresh;
    }

    static public void setRefresh(int re) {
        refresh = re;
    }

    static public int getNbParticles() {
        return nbParticles;
    }

    static public void setNbParticles(int np) {
        nbParticles = np;
    }

    public static String getParticleType() {
        return particleType;
    }

    public static void setParticleType(String particleType) {
        Config.particleType = particleType;
    }
}
