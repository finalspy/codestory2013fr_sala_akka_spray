## Essai Scala / Akka / Spray.io for CodeStory2013 FR

Voil� je voulais essayer scala et son framework d'acteurs : Akka depuis longtemps.
J'ai vu passer un twitt sur spray.io ... 
Et puis il y a eu codestory et ses questions orient�es serveur web etc.

Alors je me suis dit que ce serait une fa�on "amusante" de se fixer un objectif pour apprendre une nouvelle techno.

Mais apr�s quelques heures de bataille pour installer l'artillerie scala, sbt, scalaide, akka, spray ... et faire que tout fonctionne j'ai vite d�chant�.

Mon premier essai pour la premi�re question de lancement de code story m'a vite refroidit, ou r�chauff� c'est selon.
=> 27s de compilation sur un macbookpro (8Go de Ram, 4 cores)
=> 991s de compilation sur une box gandi de tr�s bas niveau (256Mo de Ram, 1 core)
=> 34s pour que le serveur r�ponde a la premi�re requ�te

J'arr�te Scala/Akka l� ... on verra plus tard si j'ai besoin de chauffage ... 

Au passage si un pro de Scala/Akka peut m'expliquer pourquoi c'est long et qu'est ce que fabrique SBT pendant tout ce temps.

Bilan: 
	- environ 4h pour tout installer dans les bonnes versions compatibles sur mon laptop de dev. 
	- environ 1h pour d�velopper la r�ponse a la question pr�liminaire de codestory 
	- 30 minutes pour installer le n�cessaire sur mon micro serveur chez gandi
	- 15 minutes de compilation sur la box (d�sol� je ne sais pas encore exporter un binaire scala et le lancer ^^)
	- une proposition non soumise a codestory
	- l'envie de refaire des choses simples et rapides en java/html/js avec des outils maitris�s 
	