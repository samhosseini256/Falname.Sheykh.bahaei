import java.util.Scanner;

class asli{

    public static void main(String[] args) {

        //     jadval : horoofe jadval ra dar notepad az avalin harfe bala samte rast ta akharin harf paiin samte chap bedoone fasele minevisim
        //String jadval = "رااابزکدصبمزحیییهیکربیینمنکنرنصورچشهبقدقاقاعبددارراریرزوننورهضرضنضقهموخبرمیاقبرااچوگکبادرسضدوردرقاراضیهاپاادرراشصمیشسبداضکددبلچوبرایکسهدراخددوبنرتازکلیبهزهمدبیحریریاممگکسنقدانکنوورنیوزابدبجعادیااورییااوریدرمدیددرمدید";
        //     jadvale marboot be gharz
        String jadval = "بعصنبمحجمزگکهربهیزامقبذگردراانجیصعررحسبلزدتعددزداماصیمتحصصییجطشبناماابنمتلورمزیجبرآکمبکمدیشتررردشتلقعندتاازردایصاحدبنحوامزددقاریبتفزشدهآطجدشرآکیورروعتاکآورنغدمرنپببیردرمرقدظییرددگهگآصبراقآزبرکییداکثییواکذنددرنمنددرنر";
        //     jadvale marboot be haajat

        String horoofbaad = "";
        String horoofghabl = "";
        String natijeh = "";
        String mesraa1 = "";
        String mesraa2 = "";
        int adadentekhabi ;

        do {
            System.out.print("Enter num: ");
            adadentekhabi = new Scanner(System.in).nextInt();
        }
        while (adadentekhabi <=-1 || adadentekhabi>=216); // entekhabe character az 0 ta 215



        for (int i = adadentekhabi+5 ; i<216 ; i+=6){  //+5 chon motabeghe dastoorolamale ketab va shomaresh

            horoofbaad=horoofbaad.concat(  String.valueOf(jadval.charAt(i))  );

        }
        System.out.println(horoofbaad);



        for (int i = (adadentekhabi%6)+5 , j=0 ; i<adadentekhabi; i+=6 , j++){ //adadentekhabi%6== adade shorooe shomaresh az avale jadval

            if ( adadentekhabi%6  != 0  && j==0){ // yek harfe avale shomaresh ja namanad! chon i+5 shode
                horoofghabl=horoofghabl.concat(  String.valueOf(jadval.charAt( (adadentekhabi%6)  ))  );
            }

            horoofghabl=horoofghabl.concat(  String.valueOf(jadval.charAt(i))  );

        }
        System.out.println(horoofghabl);



        natijeh =horoofghabl+horoofbaad;
        System.out.println(natijeh);


        for (int i =0 ; i<natijeh.length() ; i++) {

            if (i % 2 == 1) {
                mesraa1 = mesraa1.concat(String.valueOf(natijeh.charAt(i)));
            }

            if (i % 2 == 0) {
                mesraa2 = mesraa2.concat(String.valueOf(natijeh.charAt(i)));
            }

        }


        System.out.println("\n\n\n");

        System.out.println(mesraa1);
        System.out.println(mesraa2);



    }

}