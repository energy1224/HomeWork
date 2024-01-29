package com.iakovenko.coursework02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        ArrayList<Paragraph> ph1= readGameFile();
      //  ArrayList<Paragraph> paragraphsList = setParagraphList();
        Game game01 = new Game(ph1);
        play(game01);
    }

    public static void play(Game game01) {
        Menu menu = setMenu(game01);
        while (game01.getStartingPoint() >= 0) {
            System.out.println(menu);
            Scanner scan = new Scanner(System.in);
            int reply = scan.nextInt();
            if (reply == 1) {
                menu.start();
            } else if (reply == 2) {
                menu.back();
            } else if (reply == 3) {
                menu.escape();
            } else if (reply == 4) {
                menu.save();
            } else if (reply == 5) {
                menu.download();
            } else {
                System.out.println("Введите цифру от 1 до 5");
            }
        }
    }

    public static Menu setMenu(Game game01) {
        Command startGame = new StartGameCommand(game01);
        Command saveGame = new SaveGameCommand(game01);
        Command escapeGame = new EscapeGameCommand(game01);
        Command downloadGame = new DownloadGameCommand(game01);
        Command backToGame = new BackToGameCommand(game01);
        Menu menu = new Menu(startGame, downloadGame, escapeGame, saveGame, backToGame);
        return menu;
    }

    public static ArrayList<Paragraph> setParagraphList() {
        ArrayList<Paragraph> paragraphArrayList = new ArrayList<>();
        Paragraph po1 = new Paragraph("Лисенок", "Каждое утро Лисёнок просыпался," +
                " завтракал и шёл увидеться с Бельчонком." +
                " Это утро не было исключением. " +
                "Лисёнок пришёл на их обычное место встречи, " +
                "но Бельчонка там не было. Лисёнок ждал, ждал," +
                " но так и не смог дождаться своего друга. \" " +
                "Бельчонок не пропустил еще ни одной встречи, " +
                "вдруг он попал в беду.\" - подумал Лисёнок. Как поступить Лисенку?");
        Paragraph po2 = new Paragraph("Вернуться домой", "Вернувшись домой, " +
                "Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место " +
                "встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить " +
                "об этом Лисёнка, но они разминулись." +
                " Наконец-то друзья нашли друг друга! Игра завершилась успехом");
        Paragraph po3 = new Paragraph("Отправиться на поиски", "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.");
        Paragraph po4 = new Paragraph("Попытаться разузнать о Бельчонке у лесных жителей", "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?");
        Paragraph po5 = new Paragraph("Искать Бельчонка в одиночку", "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей");
        Paragraph po6 = new Paragraph("Расспросить Сову", "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.");
        Paragraph po7 = new Paragraph("Расспросить Волка", "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?");
        Paragraph po8 = new Paragraph("Поверить Сове и отправиться вглубь леса", "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.");
        Paragraph po9 = new Paragraph("Нужно воспользоваться шансом и раздобыть мёд", "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.");
        Paragraph po10 = new Paragraph("Подождать, вдруг пчёлы улетят", "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?");
        Paragraph po11 = new Paragraph("Нужно попытаться выкрасть мёд немедленно", "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. Игра завершилась неудачей");
        Paragraph po12 = new Paragraph("Поесть немного и передохнуть", "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей");
        Paragraph po13 = new Paragraph("Скорее отнести мёд Медвежонку", "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.");
        po1.setAnswer1(po2);
        po1.setAnswer2(po3);
        po3.setAnswer1(po4);
        po3.setAnswer2(po5);
        po4.setAnswer1(po6);
        po4.setAnswer2(po7);
        po6.setAnswer1(po8);
        po6.setAnswer2(po5);
        po7.setAnswer1(po2);
        po7.setAnswer2(po5);
        po8.setAnswer1(po5);
        po8.setAnswer2(po9);
        po9.setAnswer1(po10);
        po9.setAnswer2(po11);
        po10.setAnswer1(po12);
        po10.setAnswer2(po13);
        po13.setAnswer1(po5);
        po13.setAnswer2(po2);
        paragraphArrayList.add(po1);
        paragraphArrayList.add(po2);
        paragraphArrayList.add(po3);
        paragraphArrayList.add(po4);
        paragraphArrayList.add(po5);
        paragraphArrayList.add(po6);
        paragraphArrayList.add(po7);
        paragraphArrayList.add(po8);
        paragraphArrayList.add(po9);
        paragraphArrayList.add(po10);
        paragraphArrayList.add(po11);
        paragraphArrayList.add(po12);
        paragraphArrayList.add(po13);
        return paragraphArrayList;
    }
    public static ArrayList<Paragraph> readGameFile() {
        ArrayList<Paragraph> paragraphs = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        File file = new File("paragraphs.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String string = scanner.nextLine();
                String[] data = string.split(";");
                lines.add(string);
                Paragraph paragraph = new Paragraph(data[0], data[1]);
                paragraphs.add(paragraph);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        for (int i = 0; i < lines.size(); i++) {
           String[] data01= lines.get(i).split(";");
           if(data01.length==4){
               for (int j = 0; j < paragraphs.size(); j++) {
                   if (data01[2].equals(paragraphs.get(j).getTitle())){
                       paragraphs.get(i).setAnswer1(paragraphs.get(j));
                   }
                   if (data01[3].equals(paragraphs.get(j).getTitle())){
                       paragraphs.get(i).setAnswer2(paragraphs.get(j));
                   }

               }


           }


           }





        return paragraphs;
    }
}





