/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
package util;

public abstract class Sensor {
    private String name;
    private int modelNumber;
    
    private String getName() {
        return name;
    } 

    private void setName(String name) {
        this.name = name;
    }

    private int getModelNumber() {
        return modelNumber;
    } 

    private void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public abstract void recordMeasurement();
}
