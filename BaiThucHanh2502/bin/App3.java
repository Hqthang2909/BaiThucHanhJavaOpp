????   4 S  App3  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LApp3; main ([Ljava/lang/String;)V 
Exceptions  java/lang/Exception  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     ! out Ljava/io/PrintStream; # Nhap so nguyen: 
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V
  + , - nextInt ()I / java/lang/StringBuilder
 1 3 2 java/lang/String 4 5 valueOf (I)Ljava/lang/String;
 . 7  ) 9  la so nguyen to
 . ; < = append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 . ? @ A toString ()Ljava/lang/String; C  khong la so nguyen to
  E F  close agr [Ljava/lang/String; so I tong scanner Ljava/util/Scanner; i StackMapTable H 
SourceFile 	App3.java !               /     *? ?    
                    	                 r=? Y? ? N? "? $-? *<6? p? ?????? ? ? .Y? 0? 68? :? >? $? ? ? .Y? 0? 6B? :? >? $-? D?    
   :            	   
 '  * 	 3  8  Q  T  m  q     4    r G H    X I J   p K J   e L M    N J  O    ?    P   	? &  Q    R