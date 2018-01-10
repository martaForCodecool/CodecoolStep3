package com.company;

import javax.swing. *;
import java.awt.*;

public class Main
{
    public static void main ( String[] argum) {
        JFrame frame = new JFrame ("Hi Codecool" );
        frame.setLayout(new GridLayout(1,1));
        frame.add(new JLabel("<html>Hi, I’m Marta. My nickname is Kicek, because of my last<br>name, but only my best friends call me that. I'm from<br>Kraków, but now I live in Poznań. I love extreme sports,<br>and the most skydiving. One of my biggest dreams is to<br>experience solo free-fall and to become a solo skydiver.<br><br>I decided to apply to Codecool, because I was looking<br>for the best coding school and my impression is that<br>your 18 monthly programm is the best way to grow as<br>full-stack developer.  It's only a boot camp, but also 6<br>monthly internship. I believe Codecool will help me to<br>learn the skills needed to succeed in coding  jobs, level<br>up my career and increase my knowledge.<br><br>To become a programmer is also on my bucket list. I<br>know it will be a long and tortuous journey, but ever<br>since  I can remember I love maths, solving analytical<br>tasks and complex logical problems. I have no<br>professional experience in programming. I’ve read<br>some books like: ”Head First Java”, from the same<br>series Design Patterns”, Stepanov's and Ross’s book<br>”From Mathematics to Generic Programming”, Borycki's<br>book ”Windows 10 : Programming Universal Mobile<br>Applications”. Also, I’ve done some online courses and<br>so far I think Java and mySQL are the most exciting for<br>me. I suppose that I could be good at back-end, but I'm<br>opened to front-end and other languages. </html>", JLabel.CENTER));
        frame.setSize( 600, 800);
        frame.setVisible( true );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
