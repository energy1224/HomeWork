package com.iakovenko.javacore.lesson08;

public class RepairShop {
    private Vehicle[] vehicles = new Vehicle[6];

    // добавить свойство `private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};
    private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};

    //реализовать добавление транспортных средств в массив
    public void addToVehicles(Vehicle vehicle) {
        if (vehicle == null) throw new IllegalArgumentException("vehicle not null");
        if (vehicles[vehicles.length - 1] != null) {
            System.out.println("Repair list is already full");
            return;
        }
        for (int i = 0; i < vehicles.length; i++)
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                return;
            }
    }



    //        изменить реализацию метода `repairAll`:
    //        1) после ремонта машины менять её цвет на произвольный из массива colors
    //        2) после ремонта ссылку на транспортное средство необходимо обнулять

    public void repairAll() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null)
                vehicles[i].stop();
                vehicles[i].repair();
            if (vehicles[i] instanceof Colourable colourable) {
                int index = (int) (Math.random() * 4);
                colourable.changeColour(colors[index]);
            }
            vehicles[i] = null;
        }
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}

