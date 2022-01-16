/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo8p04.proyectofxml;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import modelo.clases.Auspiciante;
import modelo.clases.Premio;
import modelo.enums.Puesto;
/**
 * FXML Controller class
 *
 * @author Guillermo José
 */
public class AgregarPremioController {


    @FXML
    private Button guardarPremio;
    @FXML
    private Button cancelarPremio;
    @FXML
    private TextField descPrem;
    @FXML
    TableView tablaAuspPremio;
    @FXML
    TableColumn<Auspiciante, String> nombreAuspiciante;
    @FXML
    ComboBox cmbLugar;
    private static Premio[] arrPremios=new Premio[3];
    
    
    @FXML
    private void cancelarCrearPremio() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("CrearConcurso.fxml"));//no tiene el controlador especificado
        CrearConcursoController ct = new CrearConcursoController();
            
        fxmlLoader.setController(ct);
            
        BorderPane root = (BorderPane) fxmlLoader.load();
        App.changeRoot(root);
    }
    
    @FXML
    private void crearPremio() throws IOException{
        
        Premio premio= new Premio((Puesto) cmbLugar.getValue(),descPrem.getText(),(Auspiciante) tablaAuspPremio.getSelectionModel().getSelectedItem());
        
        if (cmbLugar.getValue().equals(Puesto.Primer)){
            arrPremios[0]=premio;
        }
        
        else if(cmbLugar.getValue().equals(Puesto.Segundo)){
            arrPremios[1]=premio;
        }
        
        else{
            arrPremios[2]=premio;
        }
        
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("CrearConcurso.fxml"));//no tiene el controlador especificado
        CrearConcursoController ct = new CrearConcursoController();
            
        fxmlLoader.setController(ct);
            
        BorderPane root = (BorderPane) fxmlLoader.load();
        App.changeRoot(root);
    }

    public static Premio[] getArrPremios() {
        return arrPremios;
    }
    
    
  

}
