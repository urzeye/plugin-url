package com.janetfilter.plugins.url;


import com.janetfilter.core.Environment;
import com.janetfilter.core.models.FilterRule;
import com.janetfilter.core.plugin.MyTransformer;
import com.janetfilter.core.plugin.PluginEntry;

import java.util.ArrayList;
import java.util.List;

public class URLFilterPlugin implements PluginEntry {
    private final List<MyTransformer> transformers = new ArrayList<>();

    @Override
    public void init(Environment environment, List<FilterRule> filterRules) {
        transformers.add(new HttpClientTransformer(filterRules));
    }

    @Override
    public String getName() {
        return "URL";
    }

    @Override
    public String getAuthor() {
        return "neo";
    }

    @Override
    public String getVersion() {
        return "v1.0.1";
    }

    @Override
    public String getDescription() {
        return "A plugin for the ja-netfilter, it can block http requests.";
    }

    @Override
    public List<MyTransformer> getTransformers() {
        return transformers;
    }
}
