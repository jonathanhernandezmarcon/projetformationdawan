@tag
Feature: Afficher les grades
Je veux afficher le grades A, b, c et d

	@tag1
	Scenario: calculer le grade A
		Given le systeme attends la note du controle continue
		And la note d examen
		When l utilisateur renseigne la note du controle continue
		And l utilisateur renseigne la note d examen
		Then le systeme affiche le grade A