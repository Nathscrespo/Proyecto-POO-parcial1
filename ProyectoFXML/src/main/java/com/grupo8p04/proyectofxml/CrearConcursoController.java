/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo8p04.proyectofxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Guillermo José
 */
public class CrearConcursoController implements Initializable  {
    

    @FXML
    private Button cancelarCreacionC;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void cancelarCrearC() throws IOException {
        App.setRoot("AdminConcurso");
    }  
    
}
