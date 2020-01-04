package com.ripazhask.hmjpolines;

import java.util.ArrayList;

public class HmjData {

    public static String[][] data = new String[][]{
            {"0","Anathan 'Ana' Pham","Anathan 'Ana' Pham is 1st Position of OG. He joined OG since OG was found by N0tail and Fly. He filled the most crucial position for OG. Some people call him Ana God. The most unexpected moment when he picked up IO as a carry.","https://i.imgur.com/x1X6ToX.png"},
            {"1","Topias 'Topson' Taavitsainen","Topias 'Topson' Taavitsainen is 2nd Position of OG. He is the greatest underdog in esports history. He called by N0tail to replace Fly and S4 with Ana. Some people said Dogson from the first time he played for OG in The International 2018, and they call him as Godson after winning The International 2019. His Monkey king and Zeus brought him become 'GodSon'.","https://i.imgur.com/BmuxjCI.png"},
            {"2","Sébastien 'Ceb' Debs","Sébastien 'Ceb' Debs was a coach and now he is player of OG. He is in 3rd Position. Joined since N0tail asked him to be a coach and won 4 majors, and replacing Miracle after Miracle left OG and win 2 The International. He is the biggest role of OG 2 weeks before The International 2018. From The International 2018, Valve make chat wheels about him. First is 'Ceeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeb!' and second is 'This guys has no chill'.","https://i.imgur.com/FQEBxLU.png"},
            {"3","Jesse 'Jerax' Vainikka","Jesse 'Jerax' Vainikka is 4th position of OG and a player since OG was found. He is the best player for Earth Spirit hero on DOTA 2.","https://i.imgur.com/Ttumh0K.png"},
            {"4","Johan 'N0tail' Sundstein","Johan 'N0tail' Sundstein is the founder and fill the 5th position of OG. He found OG with his ex teammates Fly. He is the best 4 captain with Puppey from Team Secret, Kuroky from Team Liquid. What he believes made him prove that friendship is the most important thing to get the champions title.","https://i.imgur.com/n7EyLQH.png"},
            {"5","Clement 'Puppey' Ivanov is the team founder of Team Secret. He is playing for Team Secret since he found and he is the executive for his own team. He is the 1st winner of The International 2011 with Natus Vincere (known as Na'Vi) with Danil 'Dendi' Ishutin.","https://www.instagram.com/p/BGAv4v1NjiI/?utm_source=ig_web_button_share_sheet"},
            {"6","Kuro 'Kuroky' Saleh Takhasomi, is an ex team of Team Liquid. He and his whole teammates from DOTA 2 Division left Team Liquid after having much arguments and don't have a better vision after The International 2019. He is the 1st winner of The International 2017 with their teammates. He is the 4th of the best captain with N0tail and Puppey. He was playing in the first roster of Team Secreat with Puppey, N0tail, Fly, and S4.","https://www.instagram.com/p/Bx-GDrhoadB/?utm_source=ig_web_button_share_sheet"}
    };

    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list= new ArrayList<>();
        for (String[] hmjData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(hmjData[0]));
            hmj.setName(hmjData[1]);
            hmj.setDescription(hmjData[2]);
            hmj.setPhoto(hmjData[3]);

            list.add(hmj);
        }
        return list;
    }
}
