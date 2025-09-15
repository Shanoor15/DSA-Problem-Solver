package com.nt.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="JODA_POLITICIAN")
public class Politician {

	@Id
	@GeneratedValue(generator="gen",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
		    name = "gen",
		    sequenceName = "user_id_seq",
		    initialValue = 1,
		    allocationSize = 1
		)
	private Integer pid;
	@Column(name="Pname")
	@NonNull
	private String pname;
	@Column(name="Paddrs")
	@NonNull
	private String paddrs;
	@Column(name="Pdob")
	@NonNull
	private LocalDateTime dob;
	@Column(name="Ptob")
	@NonNull
	private LocalTime tob;
	@Column(name="Pdoj")
	@NonNull
	private LocalDate doj;
}
