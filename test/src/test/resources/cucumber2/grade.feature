#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

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
