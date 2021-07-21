package modelo;

import java.util.ArrayList;
import java.util.List;

public class Career {

		private final Long id = null;
		private String name;
		private String studyPlan;
		private List<SchoolYear>  years;
		
		public Career(String name,String studyPlan) {
			this.name= name;
			this.studyPlan= studyPlan;
			years =  new ArrayList<SchoolYear>();
		}
		
		
		public Long getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getStudyPlan() {
			return studyPlan;
		}
		public void setStudyPlan(String studyPlan) {
			this.studyPlan=studyPlan;
		}
		public List<SchoolYear> getYears() {
			return years;
		}


		public void addYear(SchoolYear sy) {
			years.add(sy);
			
		}
		
		
//		public String toString() {
//			StringBuilder yearStuffBuild = new StringBuilder("Año: " + name + ". Materias: " );
//			stuffs.stream().forEach(stuffs -> yearStuffBuild.append("\n - "+stuffs.getName()));
//			return yearStuffBuild.toString();
//		} TODO recursion para imprimir el contenido de la carrera con sus años y sus materias
}
