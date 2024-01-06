
package com.mycompany.interfaces;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame; //Se importa el API
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class Ventana extends JFrame{
    
    JPanel panel = new JPanel(); //Creacion de un panel
    JTextArea areaTexto;
    JTextField cajaTexto1;
    public Ventana(){ //Constructor
        
        setSize(500,500); //Se establece el tamaño de la ventana, el this es opcional, pero recomendado (Ancho, Largo)

        setTitle("Escribir el titulo"); //Pone el titulo de la ventana 
        //setLocation(x,y);  //Define el lugar de la pantalla en el que va a estar la esquina superior izquierda de nuestra ventana
        //setBounds(x,y,ancho,largo) //Hace eñ setSize y el setLocation

        setLocationRelativeTo(null);  //Aparece la ventana en el centro de la pantalla

        //setResizable(False); //Restringe cambiar el tamaño de la ventana (Por default esta en true y lo permite)
        setMinimumSize(new Dimension (100, 100)); //Restringe el tamaño minimo al cual la ventana puede redireccionarse (Ancho, alto)

        //this.getContentPane().setBackground(Color.BLACK); //Se obtiene el contenido de la ventana y se cambia su color a uno negro

        
        iniciarComponentes();

                            // *cierro la ventana el programa se sigue ejecutando... recordar Poo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Este metodo si hace que al cerrar la ventana el programa finalice 

    }

    private void iniciarComponentes(){
        colocarPaneles();   //SIEMPRE USAR  
        colocarAreasTexto(); 
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesActivacion();
        colocarCajasTexto();

        //colocarCasillasVerificacion();
        //colocarListasDesplegables();
        //colocarCampoContraseña();
        //colocarTablas();
        //colocarListas();
    }


    private void colocarPaneles(){

        //////JPanel:

        // ****Panel: (Hoja sobre la mesa) Se pone sobre la ventana, y sobre ellos se pone todo lo que queramos ==> contenedor de componentes graficos****
        // ****Son utiles para organizar la ventana


        //panel.setBackground(Color.RED);  //Coloco color al Panel (NO a la ventana)

        panel.setLayout(null); //Desactivamos el diseño del panel (Layout) para que funcione el metodo etiqueta.setBound;
        this.getContentPane().add(panel); //Agregamos el panel a la ventana (Aun así es invisible)
    
        //eventoMovimientoRaton();
        //eventoRuedaMouse();
        eventoTeclado();
    }

    private void colocarEtiquetas(){

                    //JLabel

        /////  Etiqueta 1 ==> Etiqueta tipo texto

        //JLabel etiqueta = new JLabel(); //Creamos una etiqueta
        //etiqueta.setText("Hola"); //Establecemos el texto de la etiqueta... Tambien se podia hacer desde el constructor
        //etiqueta.setHorizontalAlignment (SwingConstants.CENTER) //Otra forma de establecer la alineacion orizontal del texto

        JLabel etiqueta = new JLabel("Hola", SwingConstants.CENTER); //Creamos una etiqueta que tenga texto y que defina su posicion horizontal

        etiqueta.setBounds(20,20,50,80); //Ya se uso este metodo... Sirve si usamos primero el panel.setLayout (X,Y,ANCHO,ALTO)

        //etiqueta.setForeground(Color.ORANGE);  //Define el color del componente ==> En este caso la letra   
        //etiqueta.setOpaque(True);  // (Por defecto es false) Permitimos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.YELLOW); //Cambiamos el color del fondo de la etiqueta PERO las etiquetas no lo permiten por defecto a no ser que se ponga el etiqueta.setOpaque

        //etiqueta.setFont(new Font("nombre tipo de letra (Depende del OS (guiarse de word))",Font.PLAIN(forma, tambien puede ser de forma numerica),tamaño)); //Establecer la fuente del texto

        //panel.add(etiqueta); //Agregamos la etiqueta al panel (Apareceria arriba en el centro del panel)


        /////Etiqueta 2 ==> Etiqueta tipo imagen


        ///FORMAS DE CREAR LA ETIQUETA:

        ///ImagenIcon imagen = new ImageIcon (NOMBRE ARCHIVO);
        ///JLabel etiqueta2 = new JLabel(imagen);

        ///JLabel etiqueta2 = new JLabel();
        ///etiqueta2.setIcon(new ImageIcon("nombre archivo"));

        ///JLabel etiqueta2 = new JLabel(new ImageIcon("Nombre del archivo de imagen (Este debe estar en el mismo documento del proyecto)"));  //Creo una etiqueta con imagen usando el constructor



        //etiqueta2.setBounds(x, y, ancho, alto);  //Tomar en cuenta que esto define el tamaño de la etiqueta pero NO de la imagen

        ImageIcon imagen = new ImageIcon("MaxPower.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(20,20,300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));  //Aqui estpy cambiando el tamaño de la imagen

        panel.add(etiqueta2);
    }

    private void colocarBotones(){

        //Boton 1 ==> boton texto

        JButton boton1 = new JButton("Nombre");   //Tambien existe el metodo ***setText*** para establecer un texto al boton
        boton1.setBounds(250,250,200, 50);  //RECORDAR setBounds para ubicar el boton
        boton1.setEnabled(true); //significa si se puede o no tener interaccion con el boton (LO HABILITA Y DESHABILITA)
        boton1.setMnemonic(8); //ALT + a (letra) sucede como si se diera click al boton.. interesante
        boton1.setForeground(Color.BLUE);  //Color letra
        boton1.setFont(new Font ("arial", Font.BOLD, 20)); //Establecemos la fuente de la letra del boton
        //panel.add(boton1);

        //Boton 2 ==> boton imagen

        JButton boton2 = new JButton();  //Si pongo la imagen en el constructor esta sale en su tamaño natural 
        boton2.setBounds(100, 200, 200, 200);
        //boton.setOpaque (true); //Se puede cambiar el color de fondo (No es necesario en algunas versiones de JAVA)
        ImageIcon clicAqui = new ImageIcon ("MaxPower.jpg");
        boton2.setIcon(new ImageIcon (clicAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.BLUE);

        panel.add(boton2);

        //Boton 3 ==> boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(20, 20, 110, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.BLUE, 4, true));  // Se debe colocar un LideBorder que hereda de Border (Border es una interface)

        panel.add(boton3);
    }
   
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
        radioBoton1.setBounds(50, 100, 200, 50);  
        radioBoton1.setEnabled (false); //habilita o deshabilita el boton
        radioBoton1.setText ("Holaa"); //cambiamos la letra
        radioBoton1.setFont(new Font("cooper black",0,20));
        
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();   //Esto permite que solo una opcion pueda ser marcada en un grupo de radio botones
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);       
    }
    
    private void colocarBotonesActivacion(){
        JToggleButton botonActivacion1 = new JToggleButton("Opcion1",true);
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add (botonActivacion1);
        
        JToggleButton botonActivacion2 = new JToggleButton("Opcion2",false);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add (botonActivacion2);
        
        JToggleButton botonActivacion3 = new JToggleButton("Opcion3",false);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add (botonActivacion3);
        
        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion1); //Lo mismo de radion button
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);
        
       
    }
    
    private void colocarCajasTexto(){ //Cajas de texto de una sola linea
        cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(20, 250, 150, 30);
        //cajaTexto1.setText("Hola..."); //Texto inicial en la caja de texto
        
        //System.out.println("El texto que hay en la caja es: "+cajaTexto1.getText());
        panel.add(cajaTexto1);
        
        //JTextField cajaTexto2 =new JTextField("Hola",50); //Esto solo sirve cuando el panel no esté habilitado el layout

    }
    
    private void colocarAreasTexto(){
        areaTexto = new JTextArea ();
        areaTexto.setBounds(20, 20, 300, 200);
        //areaTexto.setText("Escriba el texto aqui...");
        //areaTexto.append ( "Añade más texto ");
        //areaTexto.setEditable(true); //Permitir editar el area de texto
        //System.out.println("El texto es: "+ areaTexto.getText());
        panel.add(areaTexto);       
        
        //ScrollPane ==> Barras de dezplazamiento 
        JScrollPane barrasDezplazamiento = new JScrollPane(areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barrasDezplazamiento.setBounds(20, 20, 300, 200); //Que sean iguales al bounds donde lo quiero agregar (Area de texto en este caso)
        //barrasDezplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barrasDezplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barrasDezplazamiento);
        
    }

    private void colocarCasillasVerificacion(){
        JCheckBox casillaVerificacion1 = new JCheckBox("Rock",true);  //Ya tendria el check
        casillaVerificacion1.setEnabled(false);
        casillaVerificacion1.setBounds(20, 20, 100, 40);
        panel.add(casillaVerificacion1);
        
        JCheckBox casillaVerificacion2 = new JCheckBox("Blues");
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);
        
        JCheckBox casillaVerificacion3 = new JCheckBox("Metal");
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);
        
        JCheckBox casillaVerificacion4 = new JCheckBox("Pop");
        casillaVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaVerificacion4);
        
    }
    
    private void colocarListasDesplegables(){
        
        /*String [] paises = {"Colombia", "Peru", "Bolivia"};
        
        JComboBox listaDespegable1 = new JComboBox(paises);
        listaDespegable1.setBounds (20, 20, 100, 30);
        
        listaDespegable1.addItem("Argentina");  //Se agrega más componentes al final de la lista
        listaDespegable1.setSelectedItem("Bolivia"); //Seleccionar el primer objeto que se vea
        
        
        panel.add(listaDespegable1);*/
        
        //JComboBoxModel ==>  Interface para tener lista con objetos
        
        Persona persona1 = new Persona ("Santiago", "Colombiano",20);
        Persona persona2 = new Persona ("Nicolas", "Colombiano", 19);
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        
        JComboBox listaDesplegable2 = new JComboBox(modelo);
        listaDesplegable2.setBounds(20,20,100,30);
        
        
        panel.add(listaDesplegable2);
    }
 
    private void colocarCampoContraseña(){
        JPasswordField contraseña = new JPasswordField();
        contraseña.setBounds(20, 20, 150, 20);
        contraseña.setText("Hola"); //Hola pero cifrado
        panel.add (contraseña);
        
        String contras = "";
        
        for(int i=0; i<contraseña.getPassword().length; i++){
            contras += contraseña.getPassword()[i]; //El getPassword es tipo char... esto lo recorre y lo guarda e n un string
        }
        System.out.println("Contraseña: "+contras); //El getText no funciona
    }
    
    private void colocarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();   
        
        modelo.addColumn("Nombre");
        modelo.addColumn ( "Edad");
        modelo.addColumn("Nacionalidad");
        
        String [] persona1 = {"Santiago", "20", "Colombiano"};
        String [] persona2 = {"Nicolas", "19", "Colombiano"};
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        
        JTable tabla = new JTable(modelo);
        tabla.setBounds(20,20,300,200);
        panel.add(tabla);//Primero se añade la tabla
        
        JScrollPane barraDesplazamiento = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);   
        barraDesplazamiento.setBounds(20,20,300,200); //Luego se añade el scroll ( Para mostrar las columnas)
        

        panel.add(barraDesplazamiento);
    }
    
    private void colocarListas(){
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(new Persona ("Santiago Gomez","Colombiano",20));
        modelo.addElement(new Persona ("Nicol", "Colombiano", 19));
        modelo.addElement(new Persona ("Dario", "Colombiano", 19));
        modelo.addElement(new Persona ("Carlos", "Colombiano", 19));
        modelo.addElement(new Persona ("Jhon", "Colombiano", 19));
        modelo.addElement(new Persona ("Nicolas", "Colombiano", 19));
        modelo.addElement(new Persona ("Julian", "Colombiano", 19));
        modelo.addElement(new Persona ("Nicolas", "Colombiano", 19));
        modelo.addElement(new Persona ("Beatriz", "Colombiano", 19));
        modelo.addElement(new Persona ("Patricia", "Colombiano", 19));
        
        JList lista = new JList(modelo);
        lista.setBounds(20,20, 200, 300);
        panel.add(lista);
        
        JScrollPane scroll = new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
    }
    
    private void eventoMovimientoRaton(){
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener(){
                
            @Override
            public void mouseDragged(MouseEvent e) { //Click y arrastrar
                areaTexto.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {  //Mover sin dar click
                areaTexto.append("mouseMoved\n");
            }
        };
        panel.addMouseMotionListener(oyenteMovimientoRaton);//Oyente del movimiento del raton
    }
    
    private void eventoRuedaMouse(){
        
        MouseWheelListener ruedaRaton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                //areaTexto.append("Moviendo la ruedita\n");
                if (e.getPreciseWheelRotation() == -1 ){
                    areaTexto.append("Rueda hacia arriba\n");
                }else{
                    areaTexto.append("Rueda hacia abajo\n");
                }
            }
        };
        
        panel.addMouseWheelListener(ruedaRaton);
    }
    
    private void eventoTeclado(){
        
        KeyListener teclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        };
        addKeyListener(teclado);
    }

}
