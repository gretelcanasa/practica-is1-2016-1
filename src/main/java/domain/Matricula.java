package domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Matricula implements BaseEntity<Long> {

	@Id
	@SequenceGenerator(name = "matricula_id_generator", sequenceName = "matricula_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matricula_id_generator")
	
	private Long matricula_id;
	private Double nota;
	private String semestre;
	
	@ManyToOne
	  @JoinColumn( name = "ALBUM_ID")
	  private Alumno alumnos;
	
	@ManyToOne
	  @JoinColumn( name = "ALBUM_ID")
	private Curso cursos;
		 	 
	 
	@Override
	public Long getId() {
		return matricula_id;
	}

	@Override
	public void setId(Long id) {
		this.matricula_id = id;
	}

	public Curso getCurso() {
		return cursos;
	}

	public void setCurso(Curso curso) {
		this.cursos = curso;
	}

	public Alumno getAlumno() {
		return alumnos;
	}

	public void setAlumno(Alumno alumno) {
		this.alumnos = alumno;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

}
