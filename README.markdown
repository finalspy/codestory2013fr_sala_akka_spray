## Essai Scala / Akka / Spray.io for CodeStory2013 FR

Voilà je voulais essayer scala et son framework d'acteurs : Akka depuis longtemps.
J'ai vu passer un twitt sur spray.io ... 
Et puis il y a eu codestory et ses questions orientées serveur web etc.

Alors je me suis dit que ce serait une façon "amusante" de se fixer un objectif pour apprendre une nouvelle techno.

Mais après quelques heures de bataille pour installer l'artillerie scala, sbt, scalaide, akka, spray ... et faire que tout fonctionne j'ai vite déchanté.

Mon premier essai pour la première question de lancement de code story m'a vite refroidit, ou réchauffé c'est selon.
=> 27s de compilation sur un macbookpro (8Go de Ram, 4 cores)
=> 991s de compilation sur une box gandi de très bas niveau (256Mo de Ram, 1 core)
=> 34s pour que le serveur réponde a la première requête

J'arrète Scala/Akka là ... on verra plus tard si j'ai besoin de chauffage ... 

Au passage si un pro de Scala/Akka peut m'expliquer pourquoi c'est long et qu'est ce que fabrique SBT pendant tout ce temps.

Bilan: 
	- environ 4h pour tout installer dans les bonnes versions compatibles sur mon laptop de dev. 
	- environ 1h pour développer la réponse a la question préliminaire de codestory 
	- 30 minutes pour installer le nécessaire sur mon micro serveur chez gandi
	- 15 minutes de compilation sur la box (désolé je ne sais pas encore exporter un binaire scala et le lancer ^^)
	- une proposition non soumise a codestory
	- l'envie de refaire des choses simples et rapides en java/html/js avec des outils maitrisés 
	