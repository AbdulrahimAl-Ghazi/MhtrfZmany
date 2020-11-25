package com.mycompany.myapp32;
/*
It is allowed to use the code for a free purpose and
 it is not allowed to be sold or displayed in a
 separate application, but it can be made available as one of
 your services within your application 
 All rights reserved 1abdulraheem13@gmail.com


*/





public class TEXTN {
    
    
    private static String[][] stringss = new String[][]{
        {"صفر","واحد","إثنان","ثلاثة","اربعة","خمسة","ستة","سبعة","ثمانية","تسعة"},
        {"صفر", "عشر","عشرون","ثلاثون","اربعون","خمسون","ستون","سبعون","ثمانون","تسعون"},
        {"صفر", "مئة","مئتان","ثلاثمئة","أربعمئة","خمسمئة","ستمئة","سبعمئة","ثمانمئة","تسعمئة"}
        };
    
    public static String getText(String i){
        
 if (i.length() > 15){
     return null;
 } else {
     return ss(i);
 }
 
      }
    
    
    private static String s111(String i){
        String stri1 ="";
        String string1 = "";
        String str = "";
        String[] sr1 = new String[]{};
        if (!(i.equals(""))){
            if (i.length() == 1){
                sr1 = stringss[i.length() - 1];
                stri1 = sr1[(int)Double.parseDouble(i.substring(0, 1))];
                str = stri1 + str;
            } else {
                if (i.equals("10")){
                    str = "عشرة";
                }else{
                    if (i.equals("11")){
                        str = "أحد عشر";
                    }else{
                        if(i.equals("12")){
                            str = "إثناء عشر";
                        } else{

                            if (i.substring(0,1).equals("0")){
                                str = s111(i.substring(1,i.length()));
                            } else{
                                for (int inn = 0 ; inn < i.length() -1;inn++){
                                    string1 = string1 + "0";
                                }

                                if (!(i.substring(1,i.length()).equals(string1))){
                                    if (i.length() == 2){

                                        if (i.substring(0,1).equals("1")){

                                            str = s111((i.substring(1,i.length())));
                                        } else {
                                            str = s111(i.substring(1,i.length())) + " و";
                                        }
                                    } else {

                                        str = " و" + s111(i.substring(1,i.length()));
                                    }
                                }

                                sr1 = stringss[i.length() - 1];
                                stri1 = sr1[(int)Double.parseDouble(i.substring(0, 1))];
                                if (i.length() == 2){
                                    str = str + stri1;
                                } else {
                                    str = stri1 + str;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return str;
    }
    private static String ss(String i){
        String ss1 ="";
        String ss2 ="";
        String ss3 ="";
        String ss4 ="";
        String ss5 ="";
      String s = "";
        
        
        if (i.length() == 15){
            ss1 = s111(i.substring(i.length() - 15 ,i.length() - 12)) + " " + "ترليون";
            if (ss1.equals("صفر ترليون")){
                ss1 = "";
            } else {

                ss1 = ss1 + " و";
            }
        } else {

            if (i.length() == 14){
                ss1 = s111(i.substring(i.length() - 14 ,i.length() - 12)) + " " + "ترليون";
                if (ss1.equals("صفر ترليون")){
                    ss1 = "";
                } else {

                    ss1 = ss1 + " و";
                }
            } else {
                if (i.length() == 13){
                      if (i.subSequence(i.length() - 13 , i.length() - 12).equals("1")){
                        ss1 = "ترليون";
                    } else {
                        if (i.subSequence(i.length() - 13 , i.length() - 12).equals("2")){

                            ss1 = "ترليونان";
                        } else {
                            ss1 = s111(i.substring(i.length() - 13 ,i.length() - 12)) + " " + "ترليون";
                            

                        }}
                    if (ss1.equals("صفر ترليون")){
                        ss1 = "";
                    } else {

                        ss1 = ss1 + " و";
                    }


                }
            }

        }
        
        
        if (i.length() >= 12){
            ss2 = s111(i.substring(i.length() - 12 ,i.length() - 9)) + " " + "مليار";
            if (ss2.equals("صفر مليار")){
                ss2 = "";
            } else {

                ss2 = ss2 + " و";
            }
        } else {
            
            if (i.length() == 11){
                ss2 = s111(i.substring(i.length() - 11 ,i.length() - 9)) + " " + "مليار";
                if (ss2.equals("صفر مليار")){
                    ss2 = "";
                } else {

                    ss2 = ss2 + " و";
                }
                } else {
                if (i.length() == 10){
                        ss2 = s111(i.substring(i.length() - 10 ,i.length() - 9)) + " " + "مليار";
                        if (i.subSequence(i.length() - 4 , i.length() - 3).equals("1")){
                            ss2 = "مليار";
                        } else {
                            if (i.subSequence(i.length() - 10 , i.length() - 9).equals("2")){

                                ss2 = "ملياران";
                            } else {
                                ss2 = s111(i.substring(i.length() - 10,i.length() - 9)) + " " + "مليار";


                            }}
                        if (ss2.equals("صفر مليار")){
                            ss2 = "";
                        } else {

                            ss2 = ss2 + " و";
                        }


                }
                }

            }
            if (i.length() >= 9){
                ss3 = s111(i.substring(i.length() - 9 ,i.length() - 6)) + " " + "مليون";
                if (ss3.equals("صفر مليون")){
                    ss3 = "";
                } else {

                    ss3 = ss3 + " و";
                }
            } else {

                if (i.length() == 8){
                    ss3 = s111(i.substring(i.length() - 8 ,i.length() - 6)) + " " + "مليون";
                    if (ss3.equals("صفر مليون")){
                        ss3 = "";
                    } else {

                        ss3 = ss3 + " و";
                    }
                } else {
                    if (i.length() == 7){
                           if (i.subSequence(i.length() - 7 , i.length() - 6).equals("1")){
                            ss3 = "مليون";
                        } else {
                            if (i.subSequence(i.length() - 7 , i.length() - 6).equals("2")){

                                ss3 = "مليونان";
                            } else {
                                ss3 = s111(i.substring(i.length() - 7,i.length() - 6)) + " " + "مليون";


                            }}
                        if (ss3.equals("صفر مليون")){
                            ss3 = "";
                        } else {

                            ss3 = ss3 + " و";
                        }


                    }


                }}
            if (i.length() >= 6){
                ss4 = s111(i.substring(i.length() - 6 ,i.length() - 3)) + " " + "الف";
                if (ss4.equals("صفر الف")){
                    ss4 = "";
                } else {

                    ss4 = ss4 + " و";
                }
            } else {

                if (i.length() == 5){
                    ss4 = s111(i.substring(i.length() - 5,i.length() - 3)) + " " + "الف";
                    if (ss4.equals("صفر الف")){
                        ss4 = "";
                    } else {

                        ss4 = ss4 + " و";
                    }
                } else {
                    if (i.length() == 4){
                           if (i.subSequence(i.length() - 4 , i.length() - 3).equals("1")){
                            ss4 = "الف";
                        } else {
                            if (i.subSequence(i.length() - 4 , i.length() - 3).equals("2")){

                                ss4 = "الفان";
                            } else {
                                ss4 = s111(i.substring(i.length() - 4,i.length() - 3)) + " " + "الف";


                            }}
                        if (ss4.equals("صفر الف")){
                            ss4 = "";
                        } else {

                            ss4 = ss4 + " و";
                        }


                    }


                }}
            if (i.length() >= 3){
                ss5 = s111(i.substring(i.length() - 3,i.length())) + " ";
                
                    
            } else {

                if (i.length() == 2){
                    ss5 = s111(i.substring(i.length() - 2,i.length())) + " ";
                    
                } else {
                    if (i.length() == 1){
                        ss5 = s111(i.substring(i.length() - 1,i.length())) + " ";
                        

                    } 
                    

                }}
        
        if (i.length() > 3) {
            
            if (ss5.equals("صفر ")){
                ss5 = "";
            } 
            s = ss1 + ss2 + ss3 + ss4 + ss5;
            if(s.length() > 0){
                s = s.substring(0 ,s.length() - 1);}
        } else {
            s = ss1 + ss2 + ss3 + ss4 + ss5;
        }
            
            
        
        
        return s;
    }
    
}