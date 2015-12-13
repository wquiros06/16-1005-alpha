package com.ulacit.devappweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@XmlRootElement
@Entity
@Table(name = "detail_state")
public class DetailState extends BaseObject {
	private Long detailStateId;
	private String name;
	private HeaderState headerState;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "detail_state_id", unique = true, nullable = false)
	public Long getDetailStateId() {
		return detailStateId;
	}

	public void setDetailStateId(Long detailStateId) {
		this.detailStateId = detailStateId;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne
	@JoinColumn(name = "header_state_id", nullable = false)
	@JsonIgnore
	public HeaderState getHeaderState() {
		return headerState;
	}

	public void setHeaderState(HeaderState headerState) {
		this.headerState = headerState;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((detailStateId == null) ? 0 : detailStateId.hashCode());
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
		DetailState other = (DetailState) obj;
		if (detailStateId == null) {
			if (other.detailStateId != null)
				return false;
		} else if (!detailStateId.equals(other.detailStateId))
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
		return "DetailState [detailStateId=" + detailStateId + ", name=" + name + "]";
	}

}
