����   4 L  App9  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LApp9; main ([Ljava/lang/String;)V 
Exceptions  java/lang/Exception  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     ! out Ljava/io/PrintStream; # Nhap so nguyen: 
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V
  + , - nextInt ()I / java/lang/StringBuilder 1 So dao cua so nguyen la:
 . 3  )
 . 5 6 7 append (I)Ljava/lang/StringBuilder;
 . 9 : ; toString ()Ljava/lang/String;
 % = > ) print
  @ A  close agr [Ljava/lang/String; so I dao scanner Ljava/util/Scanner; StackMapTable 
SourceFile 	App9.java !               /     *� �    
                    	             �     K=� Y� � N� "� $-� *<� 
h
p`=
l<��� � .Y0� 2� 4� 8� <-� ?�    
   .            	  
 '  , 	 0  F  J     *    K B C    1 D E   I F E   > G H  I    �    J    K