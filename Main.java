public class Main{
    public static void main (String[]args){

        float english, hindi, science, maths, social; //these are the marks scored in respective subjects
        english = 84.5f;
        science = 8f;
        maths = 3f;
        hindi = 70f;
        social = 62f;
        float averageMarks = (english + hindi + science+ maths + social)/5; // average mark formula
float totalMarks = english + hindi + science+ maths + social; // total marks combining all subjects
        int failcount = 0; //
        String failedSubjects = "";
        if ( english < 23){failcount++;failedSubjects += "English ";}
        if ( hindi < 23){failcount++;failedSubjects += "Hindi ";}
        if ( maths < 23){failcount++;failedSubjects += "Maths ";}
        if ( science < 23){failcount++;failedSubjects += "Science ";}
        if ( social < 23){failcount++;failedSubjects += "Social Science ";}

        if (failcount>= 3){System.out.println("Fail...");
        System.out.println(failedSubjects);}
        else {if (failcount < 3) {System.out.println("Total Marks Scored : "+totalMarks+"/500");
                System.out.println("Percentage : "+averageMarks + "%");
            if (failcount != 0){System.out.println("Total Supplementary : "+failcount);}
            if (failedSubjects.isEmpty()){}else{System.out.println("Subjects with Supplementary : "+ failedSubjects);}


            System.out.print("Grade : ");
            if (averageMarks >= 90){
                System.out.println("A+ Grade");
            }else if (averageMarks>= 80 && averageMarks<90){System.out.println("A Grade");}
        else if (averageMarks >= 70 && averageMarks < 80){System.out.println("B Grade");}
            else if (averageMarks >= 60 && averageMarks < 70){System.out.println("C Grade");}
            else{System.out.println("D Grade");}}

    }}}
