# Problema

Dentro de un juego se añaden dos clases, el carro y el tanque, los cuales
requieren de diferentes métodos los cuales pueden commpartir, para esto
se proponen dos soluciones, la primera es la herencia

## La herencia

A partir de las dos clases tenemos métodos que coinciden y requieren ser
compartidas, para ello utilizamos la herencia que por medio de un ancestro 
ambas clases pueden tomar ese atributo como se muestra en la imagen:

![2021-11-03 11_00_36-Window](https://user-images.githubusercontent.com/89890819/140124435-e2407093-b525-4b16-9750-b9b3c46dba34.png)

## La composición
A través de esta ambas clases pueden tomar los métodos de una interfaz la 
cual incluye los atributos necesarios para que estas puedan funcionar

![2021-11-03 11_01_14-Window](https://user-images.githubusercontent.com/89890819/140122697-15d17dbf-d2a8-4480-a8e3-f1b7bc79341d.png)

Problema obtenido de: https://medium.com/@e0323142/composition-over-inheritance-9ace952bd007
