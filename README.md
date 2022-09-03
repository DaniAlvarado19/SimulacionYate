# SimulacionYate

La simulación del yate toma cuatro parámetros configurables: Capacidad de la bateria 1 y 2 y el consumo de energía de la batería 1 y 2, ambos medidos en Amperos por hora. De esta manera, se asume que el consumo de energía que se ingresa es la cantidad de energía aproximanda que consume el yate en todas sus diferentes operaciones sin contar aquellas relacionadas a la propulsión, el cual se toma en cuenta por aparte. 

La simulación dura aproximadamente un minuto, el cual dentro de la simulación van a ser 30 horas donde la velocidad en nudos y el nivel del sol van a estar cambiando aleatoriamente. Es importante notar que la velocidad tiene un mínimo de 0 nudos y un máximo de 7 que que el nivel del sol se mide en una escala del 1 al 10. 

Para que se logre todo, primeramente se quita el consumo básico de la bateria que ingresó el usuario de la capacidad máxima, luego se agrega la energía generada por los paneles solares y finalmente se resta lo gnerado en el proceso de propulsión. 
