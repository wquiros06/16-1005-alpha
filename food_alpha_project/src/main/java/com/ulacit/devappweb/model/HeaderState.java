package com.ulacit.devappweb.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@SuppressWarnings("serial")
@XmlRootElement
@Entity
@Table(name = "header_state")
public class HeaderState extends BaseObject {
	private int headerStateId;
	private String name;
	private String description;
	private Set<DetailState> headerDetailState;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "header_state_id", unique = true, nullable = false)
	public int getHeaderStateId() {
		return headerStateId;
	}

	public void setHeaderStateId(int headerStateId) {
		this.headerStateId = headerStateId;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 150)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "headerState", cascade = CascadeType.ALL)
	public Set<DetailState> getHeaderDetailState() {
		return headerDetailState;
	}

	public void setHeaderDetailState(Set<DetailState> headerDetailState) {
		this.headerDetailState = headerDetailState;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + headerStateId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeaderState other = (HeaderState) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (headerStateId != other.headerStateId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HeaderState [headerStateId=" + headerStateId + ", name=" + name + ", description=" + description + "]";
	}

}
