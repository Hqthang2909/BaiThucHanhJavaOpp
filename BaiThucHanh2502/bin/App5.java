????   4 A  App5  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LApp5; main ([Ljava/lang/String;)V 
Exceptions  java/lang/Exception  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     ! out Ljava/io/PrintStream; # Nhap so nguyen: 
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V
  + , - nextInt ()I / Day la so hoan thien 1 Day khong phai la so hoan thien
  3 4  close agr [Ljava/lang/String; so I tong scanner Ljava/util/Scanner; i StackMapTable 6 
SourceFile 	App5.java !               /     *? ?    
                    	             ?     T=? Y? ? N? "? $-? *<6? p? `=?l???? ? .? $? ? 0? $-? 2?    
   :            	   
 '  , 	 7  <  D  G  O  S     4    T 5 6    : 7 8   R 9 8   G : ;    < 8  =    ?    >   ?   ?    @