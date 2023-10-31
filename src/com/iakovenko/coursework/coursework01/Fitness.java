package com.iakovenko.coursework.coursework01;
import java.time.LocalDateTime;
public class Fitness {
    private String name;
    private final TrainingZone gym = new TrainingZone(TrainingZoneName.GYM);
    private final TrainingZone swimmingPool = new TrainingZone(TrainingZoneName.SWIMMING_POOL);
    private final TrainingZone groupClasses = new TrainingZone(TrainingZoneName.GROUP_CLASSES);

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

    public void addMembership(TrainingZone trainingZone, ClubCard clubCard) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        if (trainingZone == null) throw new IllegalArgumentException("TrainingZone not null");
        if (clubCard == null) throw new IllegalArgumentException("membership not null");
        //  проверил  не просрочен ли абонемент
        if(clubCard.isExpired()) {
            System.out.println("Ваш абонемент просрочен");
            return;
        }
        //  проверил  не зарегистрирован ли абонемент в одной из зон
        if (clubCard.isTraining()) {
            System.out.println("Вы уже зарегистрированы в одной из зон");
            return;
        }
        // проверил .добавить проверку дневного на бассейн.

        if(!clubCard.getTypeMembership().permittedTrainingZone.contains(trainingZone.getName())){
            System.out.println("У вас дневной абонемент и вы не можете посещать бассейн");
            return;
        }
        //  проверил  можно ли по данному абонементу пройти в желаемую зону
        if(!clubCard.checkPermittedTime()){
            System.out.println("У вашего абонемента сейчас нет доступа в тренировочную зону");
            return;
        }
     //  проверил есть ли в ней свободные места
        if (trainingZone.getRegistrationList()[trainingZone.getRegistrationList().length-1] != null){
            System.out.println("У вас есть доступ в тренировочную зону но она переполнена");
            return;
        }

        for (int i = 0; i < trainingZone.getRegistrationList().length; i++) {
            if (trainingZone.getRegistrationList()[i] == null) {
                trainingZone.getRegistrationList()[i] = clubCard;
                clubCard.setTraining(true);

//                Фамилия Имя Посещаемая зона (бассейн/тренажерный зал/групповые занятия)
//                Дата и время посещения
                System.out.println(clubCard.getHolder().getSurname()+" "
                        + clubCard.getHolder().getName()+" " + trainingZone.getName() +"\n"
                        +nowDateTime);
                return;
            }
        }

    }

    public void setRegistrationListDefault(TrainingZone trainingZone){
        if (trainingZone == null) throw new IllegalArgumentException("TrainingZone not null");
        for (int i = 0; i < trainingZone.getRegistrationList().length; i++) {
            trainingZone.getRegistrationList()[i]=null;
        }

    }

    public void printCurrentVisitors(){
        System.out.println("В тренировочных зонах сейчас тренируются");
        System.out.println("Тренажерный зал:");
        for (ClubCard person:gym.getRegistrationList()) {
            if(person!=null)
                System.out.println(person.getHolder().getSurname()+ " "+ person.getHolder().getName() );
        }

        System.out.println("Бассейн:");
        for (ClubCard person:swimmingPool.getRegistrationList()) {
            if(person!=null)
                System.out.println(person.getHolder().getSurname()+ " "+ person.getHolder().getName() );
        }

        System.out.println("Групповые занятия:");
        for (ClubCard person:groupClasses.getRegistrationList()) {
            if(person!=null)
                System.out.println(person.getHolder().getSurname()+ " "+ person.getHolder().getName() );
        }



    }
}


