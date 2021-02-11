/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_201602999;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Practica_201602999 {
public static Scanner sc = new Scanner(System.in);
static int pblancas;/*piezas iniciales*/
static int pnegras;/*piezas iniciales*/
static String jugador2="";/*nombre jugador 2*/
static String opcion="";/*seleccione una opcion*/
static String jugador1="";/*nombre jugador 1*/
static String esp="\u25CC";/* ◌ piezas fondo*/
static String piezab="\u25CB";/* ○ piezas blancas*/
static String letrab="B";/*piezas blancas*/
static String piezan="\u25CF";/* ●piezas negras*/
static String letran="N";/*piezas negras*/
static String ficha="";/*ficha*/
static String ficha2="";/*ficha*/
static int Cfila;/*cordenada fila*/
static int malaposicion;/*cordenada fila*/
static int Ccolumna;/*cordenada columna*/
static int Fnum;/*contador para imprimir tablero*/
static int turno=1;/*contador del turno*/
static String mat[][]= new String[9][8];/*Matriz o tablero ● x ◌  */

                /*
            432   
            5●1
            678
            */
    public static void metodo1(){
    /*1*/if(mat[Cfila][Ccolumna+1].equals(ficha2)){
            for(int cont11=Ccolumna+1;cont11<=7;cont11++){/*inicia el conteo para encontrar una ficha igual*/
                if(mat[Cfila][cont11].equals(esp)){/*si el espacio esta vacio debe finalizar el ciclo*/
                cont11=20;break;/*espacio vacio fin del ciclo*/
                }
                if(mat[Cfila][cont11].equals(ficha)){/*si encuentra una ficha igual puede hacer el cambio*/
                 int limite=cont11;
                    mat[Cfila][Ccolumna]=ficha;/*coloca la primera ficha*/
                    for(int cont12=Ccolumna+1;cont12<limite;cont12++){/*cambio de las fichas intermedias*/
                        mat[Cfila][cont12]=ficha;
                        malaposicion=0;/*indica que si coloco almenos una ficha sale de colocar()*/
                        cont11=20;/*si ya cambio las fichas debe salir del ciclo*/
                    }
                }
            }   
        }
        

    }
    public static void metodo2(){/*cambio diagonar derecha arriba*/
    /*2*/if(mat[Cfila-1][Ccolumna+1].equals(ficha2)){
            int mx=Ccolumna;
            int nx=Cfila-1;
            int qx=Cfila-1;
            int px=Ccolumna;
            
                for(int cont21=nx;cont21>=0;cont21--){/*resta la fila*/
                    mx=mx+1;
                    for(int cont22=mx;cont22<=7;cont22=cont22+8){/*resta de la columna*/
                        if(mat[cont21][cont22].equals(esp)){
                            cont21=-1;break;/*si hay espacios fin del ciclo*/
                        }
                        if(mat[cont21][cont22].equals(ficha)){/*si encuentra la otra ficha en diagonal*/
                        mat[Cfila][Ccolumna]=ficha;
                        malaposicion=0;
                        /*cambio de filas entre fichas*/
                            for(int cont23=qx;cont23>=cont21;cont23--){/*resta de fila*/
                                px=px+1;
                                for(int cont24=px;cont24<=px;cont24++){
                                mat[cont23][cont24]=ficha;
                                }
                            }
                            cont21=-1;/*ya encontrada la otra ficha debe salir del ciclo*/
                        }
                    }     
                    
                }
        }
    }
    public static void metodo3(){
    /*3*/if(mat[Cfila-1][Ccolumna].equals(ficha2)){
            for(int cont31=Cfila-1;cont31>=0;cont31--){
                
                if(mat[cont31][Ccolumna].equals(esp)){/*espacio vacio intermedio*/
                    cont31=-1;break;/*espacio vacio fin del ciclo*/
                }
                if(mat[cont31][Ccolumna].equals(ficha)){/*ficha igual a la del turno*/
                    int limite=cont31;/*define hasta donde se cambian fichas*/
                    mat[Cfila][Ccolumna]=ficha;
                    malaposicion=0;
                        for(int cont32=Cfila-1;cont32>limite;cont32--){
                            mat[cont32][Ccolumna]=ficha;
                            cont31=-1;/*al realizar el cambio de fichas sale del ciclo*/
                        }
                    }
                }
        }
    }    
    public static void metodo4(){
    /*4*/if(mat[Cfila-1][Ccolumna-1].equals(ficha2)){
            int mx=Ccolumna;
            int qx=Cfila-1;
            int px=Ccolumna;
            
                for(int cont41=Cfila-1;cont41>=0;cont41--){/*inicia conteo 1 fila antes*/
                    mx=mx-1;/*comienza una columna antes,luego 2,luego 3...*/
                    for(int cont42=mx;cont42>=0;cont42=cont42-8){/*resta de la columna*/
                        if(mat[cont41][cont42].equals(esp)){/*si encuentra un espacio vacio*/
                            cont41=-1;break;/*si espacio vacio deve salir del ciclo*/
                        }
                        if(mat[cont41][cont42].equals(ficha)){/*si encuentra la otra ficha en diagonal*/
                        mat[Cfila][Ccolumna]=ficha;
                        malaposicion=0;
                        /*cambio de filas entre fichas*/
                            for(int cont43=qx;cont43>=cont41;cont43--){/*resta de fila*/
                                px=px-1;
                                for(int cont44=px;cont44>=px;cont44--){
                                mat[cont43][cont44]=ficha;
                                }
                            }
                            cont41=-1;/*si cambio las fichas debe salir del ciclo*/
                        }
                    }     
                    
                }
        }        
        
    }
    public static void metodo5(){
    /*5*/if(mat[Cfila][Ccolumna-1].equals(ficha2)){
            for(int cont11=Ccolumna-1;cont11>=0;cont11--){/*inicia el conteo para encontrar una ficha igual*/
                if(mat[Cfila][cont11].equals(esp)){/*si el espacio esta vacio debe finalizar el ciclo*/
                    cont11=-1;break;/*espacio vacio fin del ciclo*/
                }
                if(mat[Cfila][cont11].equals(ficha)){/*si encuentra una ficha igual puede hacer el cambio*/
                 int limite=cont11;
                    mat[Cfila][Ccolumna]=ficha;/*coloca la primera ficha*/
                    for(int cont12=Ccolumna-1;cont12>=limite;cont12--){/*cambio de las fichas intermedias*/
                        mat[Cfila][cont12]=ficha;
                        malaposicion=0;/*indica que si coloco almenos una ficha sale de colocar()*/
                        cont11=-1;/*si ya cambio las fichas debe salir del ciclo*/
                    }
                }
            }   
        }
    }
    public static void metodo6(){/*cambio de ficha diagonal abajo izquierda*/
        /*6*/if(mat[Cfila+1][Ccolumna-1].equals(ficha2)){
            int mx=Ccolumna;
            int qx=Cfila+1;
            int px=Ccolumna;
            
                for(int cont41=Cfila+1;cont41<=7;cont41++){/*inicia conteo 1 fila despues*/
                    mx=mx-1;/*comienza una columna antes,luego 2,luego 3...*/
                    for(int cont42=mx;cont42>=0;cont42=cont42-8){/*resta de la columna*/
                        if(mat[cont41][cont42].equals(esp)){/*si encuentra un espacio vacio*/
                            cont41=20;break;/*si espacio vacio deve salir del ciclo*/
                        }
                        if(mat[cont41][cont42].equals(ficha)){/*si encuentra la otra ficha en diagonal*/
                        mat[Cfila][Ccolumna]=ficha;
                        malaposicion=0;/*indica que si coloco almenos una ficha sale de colocar()*/
                        /*cambio de filas entre fichas*/
                            for(int cont43=qx;cont43<=cont41;cont43++){/*inicia conteo 1 fila despues*/
                                px=px-1;/*comienza una columna antes,luego 2,luego 3...*/
                                for(int cont44=px;cont44>=px;cont44--){
                                mat[cont43][cont44]=ficha;
                                }
                            }
                            cont41=20;/*si cambio las fichas debe salir del ciclo*/
                        }
                    }
                }
        }
    }
    public static void metodo7(){
/*7*/if(mat[Cfila+1][Ccolumna].equals(ficha2)){
            for(int cont31=Cfila+1;cont31<=7;cont31++){
                if(mat[cont31][Ccolumna].equals(esp)){/*espacio vacio intermedio*/
                    cont31=20;break;/*espacio vacio fin del ciclo*/
                }
                if(mat[cont31][Ccolumna].equals(ficha)){/*ficha igual a la del turno*/
                    int limite=cont31;/*define hasta donde se cambian fichas*/
                    mat[Cfila][Ccolumna]=ficha;
                    malaposicion=0;
                        for(int cont32=Cfila+1;cont32<limite;cont32++){
                            mat[cont32][Ccolumna]=ficha;
                            cont31=20;/*al realizar el cambio de fichas sale del ciclo*/
                        }
                    }
                }
        }  
    }
    public static void metodo8(){
    /*8*/if(mat[Cfila+1][Ccolumna+1].equals(ficha2)){
            int mx=Ccolumna;
            int nx=Cfila+1;
            int qx=Cfila+1;
            int px=Ccolumna;
            
                for(int cont21=nx;cont21<=7;cont21++){/*suma fila*/
                    mx=mx+1;/*inicia una columnas despues,luego 2,luego3...*/
                    for(int cont22=mx;cont22<=7;cont22=cont22+8){/*columna siguiente*/
                        if(mat[cont21][cont22].equals(esp)){
                            System.out.println("hay un espacio jajaja");
                            cont21=20;break;/*si hay espacios fin del ciclo*/
                        }
                        if(mat[cont21][cont22].equals(ficha)){/*si encuentra la otra ficha en diagonal*/
                        mat[Cfila][Ccolumna]=ficha;
                        malaposicion=0;
                        /*cambio de filas entre fichas*/
                            for(int cont23=qx;cont23<=cont21;cont23++){/*resta de fila*/
                                px=px+1;/*inicia una columnas despues,luego 2,luego3...*/
                                for(int cont24=px;cont24<=px;cont24++){
                                mat[cont23][cont24]=ficha;
                                }
                            }
                            cont21=20;/*ya encontrada la otra ficha debe salir del ciclo*/
                        }
                    }     
                    
                }
        }
    }
    public static void matrix(){/*impresion de la matris*/
        
        Fnum=0;/*fnum numeracion lateral*/
        for(int Fcont=0;Fcont<8;Fcont++){//*tablero*//
            System.out.println("|"+mat[Fcont][0]+" "+mat[Fcont][1]+" "
                    +mat[Fcont][2]+" "+mat[Fcont][3]+" "
                    +mat[Fcont][4]+" "+mat[Fcont][5]+" "
                    +mat[Fcont][6]+" "+mat[Fcont][7]+"|"+Fnum);
                    Fnum=Fnum+1;
        }
        /*nuemeracion inferior*/
        System.out.println(" "+mat[8][0]+" "+mat[8][1]+" "
                    +mat[8][2]+" "+mat[8][3]+" "
                    +mat[8][4]+" "+mat[8][5]+" "
                    +mat[8][6]+" "+mat[8][7]+" "); 
    }
    public static void conteo(){/*metodo para contar las fichas*/
        pblancas=0;
        pnegras=0;
        int disponibles=0;
        for(int fil=0; fil<8;fil++){/*contador de filas*/
            for(int col=0;col<8;col++){/*contador de columnas*/
                if(mat[fil][col].equals(piezab)){
                    pblancas=pblancas+1;
                }
                if(mat[fil][col].equals(piezan)){
                    pnegras=pnegras+1;
                }
                if(mat[fil][col].equals(esp)){
                    disponibles=disponibles+1;
                } 
            }
        }
        if(disponibles==0){
                opcion="f";
                }
    
    }
    public static void ganador(){
        if(turno%2==0){
        if(pblancas<pnegras){/*ganador piezas negras*/
            System.out.println("el ganador es: "+jugador1);
            System.out.println("piezas en el tablero: "+pnegras);
            if(turno>2){
            System.out.println("turnos jugados: "+(turno/2));
            }else{
                System.out.println("turnos jugados: "+(turno/2));
            }
            
    
        }
        if(pnegras<pblancas){/*ganador piezas blancas*/
            System.out.println("el ganador es: "+jugador2);
            System.out.println("piezas en el tablero: "+pblancas);
            if(turno>2){
                System.out.println("turnos jugados: "+(turno/2));
            }else{
                System.out.println("turnos jugados: "+(turno/2));
            }
            
        }
        if(pnegras==pblancas){/*empate*/
            System.out.println("es un empate.!! :D");   
        }
        }else{
        if(pblancas<pnegras){/*ganador piezas negras*/
            System.out.println("el ganador es: "+jugador1);
            System.out.println("piezas en el tablero: "+pnegras);
            if(turno>2){
            System.out.println("turnos jugados: "+((turno+1)/2));
            }else{
                System.out.println("turnos jugados: "+(turno/2));
            }
            
    
        }
        if(pnegras<pblancas){/*ganador piezas blancas*/
            System.out.println("el ganador es: "+jugador2);
            System.out.println("piezas en el tablero: "+pblancas);
            if(turno>2){
                System.out.println("turnos jugados: "+((turno-1)/2));
            }else{
                System.out.println("turnos jugados: "+(turno/2));
            }
            
        }
        if(pnegras==pblancas){/*empate*/
            System.out.println("es un empate.!! :D");   
        }
        }
        
    }
    public static void jugador(){
        /*encabezado de los jugadores*/
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n"+jugador1+": "+pnegras+" piezas "+piezan);
        System.out.println(jugador2+": "+pblancas+" piezas "+piezab+"\n");
        if(turno%2==0){
        System.out.println("Turno"+turno+ ":"+jugador2);
            
        }else{
        System.out.println("Turno"+turno+": "+jugador1);
        }   
    }
    public static void todometodos(){
        metodo1();
        metodo2();
        metodo3();
        metodo4();
        metodo5();
        metodo6();
        metodo7();
        metodo8();
    }
    public static void colocar(){/*opcion de colocar fichas*/
        
        malaposicion=1;
        while(malaposicion !=0){/*ciclo que verifica la coordenada*/
        
            if(turno%2==0){/*verificar que ficha colocar*/
            ficha=piezab;/*turno par jugador ficha blanca*/
            ficha2=piezan;/*turno par espectador  ficha blanca*/

            }
            else{
            ficha=piezan;/*turno impar jugador ficha negra*/
            ficha2=piezab;/*turno impar espectador ficha negra*/
            }   
            
        System.out.print("ingrese la coordenada de la fila");
        Cfila= sc.nextInt();
        System.out.print("ingrese la coordenada de la columna");
        Ccolumna=sc.nextInt();
        /*verificar validez*/
        if(Ccolumna<0 || Ccolumna>7 || Cfila<0 || Cfila>7){
          System.out.println("la posicion ["+Cfila+","+Ccolumna+"] no existe en el tablero");
            malaposicion=1; continue; 
        }
        if(mat[Cfila][Ccolumna].equals(piezab) || mat[Cfila][Ccolumna].equals(piezan)){/*verificar si es posicion ocupada*/
            System.out.println("eyy la posicion esta ocupada..!!");
            malaposicion=1;   
        }
        else{
            malaposicion=1;
            /*si la posicion no esta ocupa verificar si posee ficha contraria cerca*/
            /*
            432   
            5●1
            678
            */            
            /*cada metodo"n"() buscaraca si hay una ficha distinta alrededor luego si lo hay
            buscara una ficha igual despues de ella, si cumple con ambas las sustitulle*/
            switch(Cfila){
                case 7:
                    switch(Ccolumna){
                        case 7:
                    metodo3();
                    metodo4();
                    metodo5();
                        ;break;
                        case 0:
                    metodo1();
                    metodo2();
                    metodo3();
                        ;break;
                        default:
                    metodo1();
                    metodo2();
                    metodo3();
                    metodo4();
                    metodo5();
                        ;break; 
                    }  
                ;break;
                case 6:
                    switch(Ccolumna){
                    case 0:metodo1();
                           metodo2();
                           metodo3();
                           metodo7();
                           metodo8();
                        break;
                    case 7:metodo3();
                           metodo4();
                           metodo5();
                           metodo6();
                           metodo7();
                        break;
                    default:todometodos();break;
                    }
                    ;break;
                case 5:
                    switch(Ccolumna){
                    case 0:metodo1();
                           metodo2();
                           metodo3();
                           metodo7();
                           metodo8();
                        break;
                    case 7:metodo3();
                           metodo4();
                           metodo5();
                           metodo6();
                           metodo7();
                        break;
                    default:todometodos();break;
                    }
                    ;break;
                case 4:
                    switch(Ccolumna){
                    case 0:metodo1();
                           metodo2();
                           metodo3();
                           metodo7();
                           metodo8();
                        break;
                    case 7:metodo3();
                           metodo4();
                           metodo5();
                           metodo6();
                           metodo7();
                        break;
                    default:todometodos();break;
                    }
                    ;break;
                case 3:
                    switch(Ccolumna){
                    case 0:metodo1();
                           metodo2();
                           metodo3();
                           metodo7();
                           metodo8();
                        break;
                    case 7:metodo3();
                           metodo4();
                           metodo5();
                           metodo6();
                           metodo7();
                        break;
                    default:todometodos();break;
                    }
                    ;break;
                case 2:
                    switch(Ccolumna){
                    case 0:metodo1();
                           metodo2();
                           metodo3();
                           metodo7();
                           metodo8();
                        break;
                    case 7:metodo3();
                           metodo4();
                           metodo5();
                           metodo6();
                           metodo7();
                        break;
                    default:todometodos();break;
                    }
                    ;break;
                case 1:
                    switch(Ccolumna){
                    case 0:metodo1();
                           metodo2();
                           metodo3();
                           metodo7();
                           metodo8();
                        break;
                    case 7:metodo3();
                           metodo4();
                           metodo5();
                           metodo6();
                           metodo7();
                        break;
                    default:todometodos();break;
                    }
                    ;break;
                case 0:
                    switch(Ccolumna){
                        case 7:
                    metodo5();
                    metodo6(); 
                    metodo7();
                        ;break;
                        case 0:
                    metodo1();
                    metodo7();
                    metodo8();
                        ;break;
                        default:
                    metodo1();
                    metodo5(); 
                    metodo6(); 
                    metodo7(); 
                    metodo8(); 
                        ;break;
                    }
                ;break;
                default:
                ;break;
            }
            if(malaposicion==1){
                System.out.println("la posicion ["+Cfila+","+Ccolumna+"] no puede ser utilizada");
                System.out.println("presione:");
                System.out.println("1. para saltar el turno s");
                System.out.println("2. para finalizar el juego f");
                System.out.println("3. cualquier otra letra para continuar");
                opcion=sc.next();
                switch(opcion){
                    case"s":salto();break;
                    case"f":malaposicion=0;break;
                    default:malaposicion=1;break;
                }
            }
        }
        }
        if("f".equals(opcion)){
            turno=turno-1;
        }
        turno=turno+1;/*si ya coloco la ficha cambia de turno*/
        conteo();/*hacer el conteo de fichas colocadas*/
        jugador();/*llamdo el metodo colocar encabezado del jugador*/
        matrix();/*llamando metodo para imprimir matris*/
        
    }
    public static void salto(){
        System.out.println("usted salto el juego");
        turno=turno+1;/*cambia de turno*/
        conteo();
        jugador();
        matrix();
        
    }
    public static void reiniciar(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");     
    }
    public static void mostrar(){/*mostrar la matriz con letras*/
        /*revisar la matriz y cambiar variables*/
        for(int fil=0; fil<8;fil++){/*contador de filas*/
            for(int col=0;col<8;col++){/*contador de columnas*/
                if(mat[fil][col].equals(piezab)){
                    mat[fil][col]=letrab;
                }
                if(mat[fil][col].equals(piezan)){
                    mat[fil][col]=letran;
                }
            }
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        matrix();
        String letra="s";
        System.out.println("presione una letra para continuar");
        letra= sc.next();
        if(!"asdfasdfasllñq123as".equals(letra)){
        for(int fil=0; fil<8;fil++){/*contador de filas*/
            for(int col=0;col<8;col++){/*contador de columnas*/
                if(mat[fil][col].equals("B")){
                    mat[fil][col]=piezab;
                }
                if(mat[fil][col].equals("N")){
                    mat[fil][col]=piezan;
                }
            }
        }
        jugador();
        matrix();
        }
        
    }  
    public static void main(String[] args) {
        
        
        opcion= "inicio";
        String partida= "y";
        while(!"f".equals(opcion)){
            turno=1;
            System.out.println("Bienvenido a Reversi..!!" );
            System.out.println("Desea iniciar una partida" );
            System.out.println("1. presione f para salir" );
            System.out.println("2. presione cualquier otra letra para continuar" );
            opcion= sc.next();
            
            
             
             
            if(!"f".equals(opcion)){
            opcion= "";
            System.out.println("ingrese el nombre del primer jugador "+piezan);
            jugador1=sc.next();
            System.out.println("ingrese el nombre del segundo jugador "+piezab);
            jugador2=sc.next();            
            /*Matriz o tablero ● x ◌  */
                for (int F=0; F< 8; F++) {
                    for(int C=0; C<8;C++){
                    mat[F][C]=esp;
                    }
                }
                mat[8][0]="0";
                mat[8][1]="1";
                mat[8][2]="2";
                mat[8][3]="3";
                mat[8][4]="4";
                mat[8][5]="5";
                mat[8][6]="6";
                mat[8][7]="7";
                
                
                /*piezas prueba
                mat[7][7]=piezan;
                mat[5][5]=piezab;*/
            
               

                /*piezas del centro*/
                mat[3][3]=piezab;
                mat[3][4]=piezan;
                mat[4][3]=piezan;
                mat[4][4]=piezab;
                conteo();/*conteo de fichas iniciales*/
                jugador();/*llamndo metodo para encabezador de jugador*/
                matrix();/*llamando metodo para imprimir matris*/
            /*ciclo para la partida*/
            while(!"f".equals(opcion)  && !"r".equals(opcion)){
                System.out.println("\nSeleccione una de las siguientes opciones");
                System.out.println("1. presione (c) para colocar una ficha");
                System.out.println("2. presione (s) para saltar el turno");
                System.out.println("3. presione (r) reiniciar el juego");
                System.out.println("4. presione (m) mostrar la matriz");
                System.out.println("5. presione (f) finalizar la partida");
                opcion= sc.next();
                
                switch(opcion){
                    case"c":/*colocar una ficha*/colocar();break;
                    case"s":/*saltar el turno*/salto();break;    
                    case"r":/*reiniciar el juego*/reiniciar();break;    
                    case"m":/*mostrar la matriz*/mostrar();break;    
                    case"f":System.out.println("\nFin del juego..!!\n");break;
                    default:System.out.println("\nNo escogio ninguna opcion"); break;
                }
                
        
            }
            if(!"r".equals(opcion)){
            ganador();
            }
            
            
        }

        
    }
    
}

}