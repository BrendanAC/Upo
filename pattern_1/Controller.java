/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_1;

/**
 *
 * @author Anak
 */
public class Controller {
    private Model model;
    private MyProjectPage myProjectPage;
    private DMProjectPage dmProjectPage;
    private PMProjectPage pmProjectPage;
    
    Controller(Model model, MyProjectPage myProjectPage){
        this.model = model;
        this.myProjectPage = myProjectPage; 
    }
    Controller(Model model, DMProjectPage dmProjectPage){
        this.model = model;
        this.dmProjectPage = dmProjectPage;
    }
    Controller(Model model, PMProjectPage pmProjectPage){
        this.model = model;
        this.pmProjectPage = pmProjectPage;
    }
    
    void updateMyProjectPage(){
        myProjectPage.initComponent();
    }
    void updateDMProjectPage(){
        dmProjectPage.initComponent();
    }
    void updatePMProjectPage(){
        pmProjectPage.initComponent();
    }
    
}
