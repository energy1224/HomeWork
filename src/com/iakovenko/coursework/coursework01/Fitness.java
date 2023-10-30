package com.iakovenko.coursework.coursework01;

public class Fitness {
    //  private final int numberOfZones = 3;
    private String name;


    private final TrainingZone gym = new TrainingZone(ZoneName.GYM);
    private final TrainingZone swimmingPool = new TrainingZone(ZoneName.SWIMMING_POOL);
    private final TrainingZone groupClasses = new TrainingZone(ZoneName.GROUP_CLASSES);

    public Fitness(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public TrainingZone getGym() {
        return gym;
    }

    public TrainingZone getSwimmingPool() {
        return swimmingPool;
    }

    public TrainingZone getGroupClasses() {
        return groupClasses;
    }

    @Override
    public String toString() {
        return "Fitness{" +
                "name='" + name + '\'' +
                ", gym=" + gym +
                ", swimmingPool=" + swimmingPool +
                ", groupClasses=" + groupClasses +
                '}';
    }

//    У Фитнеса должен быть реализован функционал добавления абонемента в одну из зон:
//    Метод принимает на вход желаемую зону (тренажерный зал или бассейн, или групповые занятия) и абонемент.
//    Перед добавлением абонемента в соответствующий массив необходимо проверить:
//    можно ли по данному абонементу пройти в желаемую зону и есть ли в ней свободные места
//    не просрочен ли абонемент
//    не зарегистрирован ли абонемент в одной из зон
//    Если абонемент проходит проверку п.2, то он добавляется в выбранную зону, в противном случае в консоль необходимо вывести причину отказа

    public void addMembership(TrainingZone zone, Membership membership) {
        if (zone == null) throw new IllegalArgumentException("TrainingZone not null");
        if (membership == null) throw new IllegalArgumentException("membership not null");
        boolean isContain = false;
        if (membership.isTraining()) {
            System.out.println("Вы уже тренируетесь в другой зоне");
            return;
        }
     //   if() прверка на бассейн до 16.00
        if (zone.getpermitedTypeMembership().contains(membership.getTypeMembership())) isContain = true;
        if (!isContain) {
            System.out.println("У вас нет доступа в тренировочную зону " + zone.getName());
            return;
        }
        if ((zone.getRegistrationList()[zone.getRegistrationList().length - 1] != null)) {
            System.out.println("У вас есть доступ в тренировочную зону " + zone.getName() + " , но она переполнена");
            return;
        }
//        if () {
//            System.out.println("У вас просрочен абонемент");
//            return;
//        }
        int index = 0;
        while (index < zone.getRegistrationList().length) {
            if (zone.getRegistrationList()[index] == null) {
                zone.getRegistrationList()[index] = membership;
                membership.setTraining(true);
                return;
            }
            index++;
        }
    }

    public void setRegistrationListDefault(TrainingZone zone){
        if (zone == null) throw new IllegalArgumentException("TrainingZone not null");
        for (int i = 0; i < zone.getRegistrationList().length-1 ; i++) {
            zone.getRegistrationList()[i]=null;
        }

    }
}


