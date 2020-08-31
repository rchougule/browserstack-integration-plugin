package com.browserstack.automate.ci.jenkins;

import hudson.model.Action;
import hudson.model.Run;

public abstract class AbstractTextForBuild implements Action {
    private Run<?, ?> build;

    protected String displayName;
    protected String iconFileName;
    protected String reportUrl;

    @Override
    public String getIconFileName() {
        return iconFileName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String getUrlName() {
        return reportUrl;
    }

    public Run<?, ?> getBuild() {
        return build;
    }

    public void setBuild(Run<?, ?> build) {
        this.build = build;
    }

    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl.replaceAll("[:.()|/ ]", "").toLowerCase();
    }

}