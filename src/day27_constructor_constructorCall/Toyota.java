package day27_constructor_constructorCall;


    public class Toyota{

        //objenin olusturuldugu class'ta genelde main method olusturulmaz.

        String marka="Toyota";
        int tekerAdedi=4;
        boolean motorVarMi=true;
        String model;
        String yakit;
        int yil;


        public void maxHiz(){
            if (yakit.equals("Benzin")){
                System.out.println("Benzinli araclar maximum 240 kilometre hiz yapar.");
            } else if (yakit.equals("Dizel")){
                System.out.println("Dizel araclar maximum 260 km hiz yapar.");
            }

        }//method

        public void renkTercihleri(){
            if(model.equals("Corolla")){
                System.out.println("Corolla renk secenekleri kirmizi ve beyaz.");
            } else if (model.equals("Yaris")){
                System.out.println("Yaris icin renk secenekleri sari ve lacivert.");

            }

        }//method

    }//main

