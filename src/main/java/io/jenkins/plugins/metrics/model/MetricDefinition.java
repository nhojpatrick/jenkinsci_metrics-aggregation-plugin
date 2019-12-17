package io.jenkins.plugins.metrics.model;

import java.io.Serializable;
import java.util.Objects;

public class MetricDefinition implements Serializable {
    private static final long serialVersionUID = 5311316796142816504L;

    private String id;
    private String displayName;
    private String description;
    private String reportedBy;
    private int priority;

    public MetricDefinition(final String id) {
        this.id = id;
    }

    public MetricDefinition(final String id, final String displayName, final String description,
            final String reportedBy, final int priority) {
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.reportedBy = reportedBy;
        this.priority = priority;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(final String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(final int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        // needs to be the ID to be usable for jelly
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof MetricDefinition)) {
            return false;
        }

        MetricDefinition other = (MetricDefinition) o;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
