package com.github.forax.smartass.util;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public final class SmartMap extends AbstractMap<Object, Object> {
  private final Map<Object, Object> map;
  private transient Set<Object> keySet;
  private transient Collection<Object> values;
  private transient Set<Map.Entry<Object, Object>> entrySet;

  public SmartMap(Map<Object, Object> map) {
    this.map = map;
  }

  @Override
  public int size() {
    return map.size();
  }
  @Override
  public boolean isEmpty() {
    return map.isEmpty();
  }
  @Override
  public Object get(Object key) {
    return map.get(key);
  }
  @Override
  public Object getOrDefault(Object key, Object defaultValue) {
    return map.getOrDefault(key, defaultValue);
  }
  @Override
  public boolean containsKey(Object key) {
    return map.containsKey(key);
  }
  @Override
  public void forEach(BiConsumer<? super Object, ? super Object> action) {
    map.forEach(action);
  }

  @Override
  public Set<Object> keySet() {
    return (keySet != null) ? keySet : (keySet = Collections.unmodifiableSet(map.keySet()));
  }
  @Override
  public Collection<Object> values() {
    return (values != null) ? values : (values = Collections.unmodifiableCollection(map.values()));
  }
  @Override
  public Set<Map.Entry<Object, Object>> entrySet() {
    return (entrySet != null) ? entrySet : (entrySet = Collections.unmodifiableSet(map.entrySet()));
  }

  private static String asJsonValue(Object o) {
    if (o instanceof String) {
      return '\"' + o.toString() + '"';
    }
    return String.valueOf(o);
  }

  @Override
  public String toString() {
    return map
        .entrySet()
        .stream()
        .map(entry -> asJsonValue(entry.getKey()) + ": " + asJsonValue(entry.getValue()))
        .collect(Collectors.joining(",", "{", "}"));
  }
}