package com.iakovenko.javacore.lesson10.images;

public class TaskClone {
    public static void main(String[] args) {
        Image image01 = new Image("www.icon01");
        Image image02 = new Image("www.icon02");
        Image image04 = new Image("www.icon04");
        Image image05 = new Image("www.icon05");
        Drawable [] drawable01 = new Drawable[]{image01,image02};
        Drawable [] drawable02 = new Drawable[]{image04,image05};

        Gallery gallery01 =new Gallery("Summer",drawable01);
        Gallery gallery02 = new Gallery("Winter",drawable01);
        Gallery gallery03 = new Gallery("Spring",drawable02);
        Drawable[] drawable03 = new Drawable[]{gallery01,gallery03,gallery02};
        Editor editor01 = new Editor(image01);
        Editor editor02 = new Editor(image01);
        Editor editor03 = new Editor(image02);
        Editor editor04 = new Editor(gallery01);
        Editor editor05 = new Editor(gallery02);
        Editor editor06 = new Editor(gallery03);



        Gallery copyGallery = gallery01;
        System.out.println(copyGallery.getImages()==gallery01.getImages());
        copyGallery=gallery01.clone();
        System.out.println(copyGallery.getImages()==gallery01.getImages());
        System.out.println();


        Editor copyEditor = editor01.clone();
        copyEditor.setDrawable(copyGallery);



        System.out.println(copyEditor==editor01);

      //  editor04.show();
        editor01.show();
        copyEditor.show();



//
//        System.out.println(editor01);
//        System.out.println(editor04);
//     //   Editor copyEditor = editor04;
//
//        System.out.println(copyEditor==editor04);
//        copyEditor=editor04.clone();
//
//        System.out.println(copyEditor==editor04);
//
//        editor01.setDrawable(gallery01);
//        System.out.println(editor01);
//
//        copyEditor= editor01.clone();
//
//        System.out.println(copyEditor);
//        System.out.println(copyEditor==editor01);
//        editor04.setDrawable(image05);
//        editor04.show();
//        editor01.show();
//        copyEditor.show();









        // копия ссылки. при сравнении ссылок = true
//        Image copyImage = image01;
//        System.out.println(copyImage==image01);
        // клонирование. создается новый объект. при сравнении ссылок = false
//        copyImage = image01.clone();
//        System.out.println(copyImage==image01);
//        System.out.println(copyImage);
//        System.out.println(image01);

//        Gallery copyGallery = gallery01;
//        System.out.println(copyGallery==gallery01);
//        System.out.println(copyGallery.getImages()==gallery01.getImages());
//        copyGallery=gallery01.clone();
//        System.out.println(copyGallery==gallery01);
//        System.out.println(copyGallery);
//        System.out.println(gallery01);
//        System.out.println(copyGallery.getImages()==gallery01.getImages());























    }
}
