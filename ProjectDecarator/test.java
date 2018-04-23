/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDecarator;

import javax.swing.JFrame;

/**
 *
 * @author Anak
 */
public class test {
    public static void main(String[] args){
        projectPage projectpage = new CommonProjectPage();
        projectPage dmProjectPage = new DMProjectPage(new CommonProjectPage());
        
        
        dmProjectPage.initComopnenet(new JFrame());
}
