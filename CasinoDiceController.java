/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author XeroFox
 */
public class CasinoDiceController implements Initializable {
    
    @FXML
    void MenuCloseButton(ActionEvent event){
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }
    
    @FXML
    void MenuKijelentkezesButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoLogin.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuRouletteButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoRoulette.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    @FXML
    void MenuFooldalGomb(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoFomenu.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    @FXML
    void MenuProfileButton(ActionEvent event) throws IOException {
        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoProfile.fxml"));
        Scene ProfileViewScene = new Scene(ProfileViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ProfileViewScene);
        window.show();
    }
    
    @FXML
    void MenuBJButton(ActionEvent event) throws IOException {
        Parent BJViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoBJ.fxml"));
        Scene BJViewScene = new Scene(BJViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(BJViewScene);
        window.show();
    }

    @FXML
    void MenuBoltButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoBolt.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuCoinButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoCoin.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuFeltoltesButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoFeltoltes.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuSlotIButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoSlotI.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuWheelButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoWheel.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuSlotIIButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoSlotII.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    /////////
    ////////
    ///////
    
    Random rand = new Random();
    
    @FXML
    private Label kocka1Label;
    @FXML
    private Label kocka2Label;
    @FXML
    private Label kocka3Label;
    @FXML
    private Label gep1Label;
    @FXML
    private Label gep2Label;
    @FXML
    private Label gep3Label;
    @FXML
    private Label eredmenyLabel;
    @FXML
    private Label JatekosLabel;    
    @FXML
    private Label GepLabel;    
    
    public  int[] jatekosDobas(){
        
           int kocka1 = rand.nextInt(6)+1; 
           int kocka2 = rand.nextInt(6)+1; 
           int kocka3 = rand.nextInt(6)+1; 
           
           while(true)
           {
               if (kocka1 == kocka2 || kocka1 == kocka3 || kocka2 == kocka3 ) {
                   break;
               }
               if (kocka1+kocka2+kocka3 == 6) {
                   break;
               }
               if (kocka1+kocka2+kocka3 == 15) {
                   break;
               }
               
               kocka1 = rand.nextInt(6)+1; 
               kocka2 = rand.nextInt(6)+1; 
               kocka3 = rand.nextInt(6)+1;
           }
           
           int[] dobas = new int[3];
           
           dobas[0] = kocka1;
           dobas[1] = kocka2;
           dobas[2] = kocka3;
           
           return dobas;
    }
    public  int[] gepDobas(){
        
           int kocka1 = rand.nextInt(6)+1; 
           int kocka2 = rand.nextInt(6)+1; 
           int kocka3 = rand.nextInt(6)+1; 
           
           while(true)
           {
               if (kocka1 == kocka2 || kocka1 == kocka3 || kocka2 == kocka3 ) {
                   break;
               }
               if (kocka1+kocka2+kocka3 == 6) {
                   break;
               }
               if (kocka1+kocka2+kocka3 == 15) {
                   break;
               }
               
               kocka1 = rand.nextInt(6)+1; 
               kocka2 = rand.nextInt(6)+1; 
               kocka3 = rand.nextInt(6)+1;
           }
           
           int[] dobas = new int[3];
           
           dobas[0] = kocka1;
           dobas[1] = kocka2;
           dobas[2] = kocka3;
           
           return dobas;
    }
    
    public String eredmeny(int[] jatekos, int[] gep){
        
       
        if (gep[0] == 1 && gep[1] == 2 && gep[2] == 3) {
            return "Nyertél!";  
        }
        
        if (gep[0] == 4 && gep[1] == 5 && gep[2] == 6) {
            return "Vesztettél!";
        }
        
        if (gep[0]==gep[1] && gep[0] == gep[2]) {
            return "Vesztettél!";
        }
        
        if (gep[1] != gep[2] && gep[2] == 6) {
            return "Vesztettél!";
        }
        
        if (gep[0] != gep[1] && gep[0] == 1) {
            return "Nyertél!";
        }
        
        int gep_pont;   //  nincs automata eredmény
        
        if (gep[0] == gep[1]) {
            gep_pont = gep[2];
        }
        else
            gep_pont = gep[0];
        
        if (jatekos[0] == 1 && jatekos[1] == 2 && jatekos[2] == 3) {
            return "Vesztettél!";
        }
        
        if (jatekos[0] == 4 && jatekos[1] == 5 && jatekos[2] == 6) {
            return "Nyertél!";
        }
        
        if (jatekos[0] == jatekos[1] && jatekos[0] == jatekos[2]) {
            return "Nyertél!";
        }
        
        int jatekos_pont;
        
        if(jatekos[0] == jatekos[1]){
            jatekos_pont = jatekos[2];
        }
        else
            jatekos_pont = jatekos[0];
        
        
        if (jatekos_pont > gep_pont) {
            return "Nyertél!";
        }
        else if(gep_pont > jatekos_pont){
            return "Vesztettél!";
        }
        
        
        return "Döntetlen!";
    }
    
    @FXML
    void Start(ActionEvent event) {
           int[] jatekos = jatekosDobas();
           int[] gep = gepDobas(); 
        
           Arrays.sort(jatekos);
           Arrays.sort(gep);

           kocka1Label.setText(""+jatekos[0]);
           kocka2Label.setText(""+jatekos[1]);
           kocka3Label.setText(""+jatekos[2]);
           
           gep1Label.setText(""+gep[0]);
           gep2Label.setText(""+gep[1]);
           gep3Label.setText(""+gep[2]);
           
           
           eredmenyLabel.setText(eredmeny(jatekos,gep));
           
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}