package com.robertidr.ExamRealTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * II praktinė užduotis JAVA programavimas
 * 1.      Sukurkite klasę Darbuotojas kuri turėtų šiuos laukus: id, vardas, pavarde, gimimo_metai, pareigos, skyrius.
 * 2.      Vykdymo klasėje (main metode) sukurkite Darbuotojas klasės objektus talpinančią kolekciją (LinkedList, ArrayList ar kitą).
 * 3.      Sukonfigūruokite duomenų bazės prisijungimą ir iš jos užpildykite kolekciją duomenimis iš turimos MySQL duomenų bazės lentelės. Vykdymo klasėje sukurkite statinį metodą uzkrautiDuomenis() kuris užkraus visus darbuotojų duomenis iš MySQL į jūsų susikurtą kolekciją.
 * 4.      Suprogramuokite kolekcijos išvedimą taip, kad visi darbuotojai kolekcijoje būtų išdėlioti ir išvedami didėjimo tvarka: pagal skyrių, jei skyrius yra vienodas, tuomet pagal pareigas, jei pareigos yra vienodos tuomet pagal vardus.
 * 5.      Vykdymo klasėje sukurkite statinį metodą int darbuotojuSkyriuje(String skyrius) kuris suskaičiuoja ir gražina kiek tam tikrame skyriuje dirba darbuotojų.
 *
 * Pastabos
 * Visos Jūsų sukurtos klasės privalo būti dokumentuotos, visi vardai (kintamųjų ir klasių) privalo būti sudaryti laikantis taisyklių.
 */
@SpringBootApplication
public class ExamRealTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamRealTestApplication.class, args);
	}

}

