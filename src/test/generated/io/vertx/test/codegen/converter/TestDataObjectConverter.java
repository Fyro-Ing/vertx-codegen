package io.vertx.test.codegen.converter;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.util.Objects;

/**
 * Converter for {@link io.vertx.test.codegen.converter.TestDataObject}.
 * NOTE: This class has been automatically generated from the {@link "io.vertx.test.codegen.converter.TestDataObject} original class using Vert.x codegen.
 */
public class TestDataObjectConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TestDataObject obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "addedAggregatedDataObjects":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                obj.addAddedAggregatedDataObject(new io.vertx.test.codegen.converter.AggregatedDataObject((JsonObject)item));
            });
          }
          break;
        case "addedBoxedBooleanValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Boolean)
                obj.addAddedBoxedBooleanValue((Boolean)item);
            });
          }
          break;
        case "addedBoxedByteValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                obj.addAddedBoxedByteValue(((Number)item).byteValue());
            });
          }
          break;
        case "addedBoxedCharValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addAddedBoxedCharValue(((String)item).charAt(0));
            });
          }
          break;
        case "addedBoxedDoubleValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                obj.addAddedBoxedDoubleValue(((Number)item).doubleValue());
            });
          }
          break;
        case "addedBoxedFloatValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                obj.addAddedBoxedFloatValue(((Number)item).floatValue());
            });
          }
          break;
        case "addedBoxedIntValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                obj.addAddedBoxedIntValue(((Number)item).intValue());
            });
          }
          break;
        case "addedBoxedLongValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                obj.addAddedBoxedLongValue(((Number)item).longValue());
            });
          }
          break;
        case "addedBoxedShortValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                obj.addAddedBoxedShortValue(((Number)item).shortValue());
            });
          }
          break;
        case "addedBuffers":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addAddedBuffer(io.vertx.core.buffer.Buffer.buffer(java.util.Base64.getDecoder().decode((String)item)));
            });
          }
          break;
        case "addedHttpMethods":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addAddedHttpMethod(java.util.concurrent.TimeUnit.valueOf((String)item));
            });
          }
          break;
        case "addedJsonArrays":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonArray)
                obj.addAddedJsonArray(((JsonArray)item).copy());
            });
          }
          break;
        case "addedJsonObjects":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                obj.addAddedJsonObject(((JsonObject)item).copy());
            });
          }
          break;
        case "addedObjects":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Object)
                obj.addAddedObject(item);
            });
          }
          break;
        case "addedStringValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addAddedStringValue((String)item);
            });
          }
          break;
        case "aggregatedDataObject":
          if (member.getValue() instanceof JsonObject) {
            obj.setAggregatedDataObject(new io.vertx.test.codegen.converter.AggregatedDataObject((JsonObject)member.getValue()));
          }
          break;
        case "aggregatedDataObjectMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, io.vertx.test.codegen.converter.AggregatedDataObject> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof JsonObject)
                map.put(entry.getKey(), new io.vertx.test.codegen.converter.AggregatedDataObject((JsonObject)entry.getValue()));
            });
            obj.setAggregatedDataObjectMap(map);
          }
          break;
        case "aggregatedDataObjectSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<io.vertx.test.codegen.converter.AggregatedDataObject> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(new io.vertx.test.codegen.converter.AggregatedDataObject((JsonObject)item));
            });
            obj.setAggregatedDataObjectSet(list);
          }
          break;
        case "aggregatedDataObjects":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.test.codegen.converter.AggregatedDataObject> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(new io.vertx.test.codegen.converter.AggregatedDataObject((JsonObject)item));
            });
            obj.setAggregatedDataObjects(list);
          }
          break;
        case "booleanValue":
          if (member.getValue() instanceof Boolean) {
            obj.setBooleanValue((Boolean)member.getValue());
          }
          break;
        case "boxedBooleanSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Boolean> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Boolean)
                list.add((Boolean)item);
            });
            obj.setBoxedBooleanSet(list);
          }
          break;
        case "boxedBooleanValue":
          if (member.getValue() instanceof Boolean) {
            obj.setBoxedBooleanValue((Boolean)member.getValue());
          }
          break;
        case "boxedBooleanValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Boolean> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Boolean)
                map.put(entry.getKey(), (Boolean)entry.getValue());
            });
            obj.setBoxedBooleanValueMap(map);
          }
          break;
        case "boxedBooleanValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Boolean> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Boolean)
                list.add((Boolean)item);
            });
            obj.setBoxedBooleanValues(list);
          }
          break;
        case "boxedByteSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Byte> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).byteValue());
            });
            obj.setBoxedByteSet(list);
          }
          break;
        case "boxedByteValue":
          if (member.getValue() instanceof Number) {
            obj.setBoxedByteValue(((Number)member.getValue()).byteValue());
          }
          break;
        case "boxedByteValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Byte> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                map.put(entry.getKey(), ((Number)entry.getValue()).byteValue());
            });
            obj.setBoxedByteValueMap(map);
          }
          break;
        case "boxedByteValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Byte> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).byteValue());
            });
            obj.setBoxedByteValues(list);
          }
          break;
        case "boxedCharSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Character> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(((String)item).charAt(0));
            });
            obj.setBoxedCharSet(list);
          }
          break;
        case "boxedCharValue":
          if (member.getValue() instanceof String) {
            obj.setBoxedCharValue(((String)member.getValue()).charAt(0));
          }
          break;
        case "boxedCharValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Character> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof String)
                map.put(entry.getKey(), ((String)entry.getValue()).charAt(0));
            });
            obj.setBoxedCharValueMap(map);
          }
          break;
        case "boxedCharValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Character> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(((String)item).charAt(0));
            });
            obj.setBoxedCharValues(list);
          }
          break;
        case "boxedDoubleSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Double> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).doubleValue());
            });
            obj.setBoxedDoubleSet(list);
          }
          break;
        case "boxedDoubleValue":
          if (member.getValue() instanceof Number) {
            obj.setBoxedDoubleValue(((Number)member.getValue()).doubleValue());
          }
          break;
        case "boxedDoubleValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Double> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                map.put(entry.getKey(), ((Number)entry.getValue()).doubleValue());
            });
            obj.setBoxedDoubleValueMap(map);
          }
          break;
        case "boxedDoubleValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Double> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).doubleValue());
            });
            obj.setBoxedDoubleValues(list);
          }
          break;
        case "boxedFloatSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Float> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).floatValue());
            });
            obj.setBoxedFloatSet(list);
          }
          break;
        case "boxedFloatValue":
          if (member.getValue() instanceof Number) {
            obj.setBoxedFloatValue(((Number)member.getValue()).floatValue());
          }
          break;
        case "boxedFloatValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Float> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                map.put(entry.getKey(), ((Number)entry.getValue()).floatValue());
            });
            obj.setBoxedFloatValueMap(map);
          }
          break;
        case "boxedFloatValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Float> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).floatValue());
            });
            obj.setBoxedFloatValues(list);
          }
          break;
        case "boxedIntSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Integer> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).intValue());
            });
            obj.setBoxedIntSet(list);
          }
          break;
        case "boxedIntValue":
          if (member.getValue() instanceof Number) {
            obj.setBoxedIntValue(((Number)member.getValue()).intValue());
          }
          break;
        case "boxedIntValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Integer> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                map.put(entry.getKey(), ((Number)entry.getValue()).intValue());
            });
            obj.setBoxedIntValueMap(map);
          }
          break;
        case "boxedIntValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Integer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).intValue());
            });
            obj.setBoxedIntValues(list);
          }
          break;
        case "boxedLongSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Long> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).longValue());
            });
            obj.setBoxedLongSet(list);
          }
          break;
        case "boxedLongValue":
          if (member.getValue() instanceof Number) {
            obj.setBoxedLongValue(((Number)member.getValue()).longValue());
          }
          break;
        case "boxedLongValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Long> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                map.put(entry.getKey(), ((Number)entry.getValue()).longValue());
            });
            obj.setBoxedLongValueMap(map);
          }
          break;
        case "boxedLongValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Long> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).longValue());
            });
            obj.setBoxedLongValues(list);
          }
          break;
        case "boxedShortSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Short> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).shortValue());
            });
            obj.setBoxedShortSet(list);
          }
          break;
        case "boxedShortValue":
          if (member.getValue() instanceof Number) {
            obj.setBoxedShortValue(((Number)member.getValue()).shortValue());
          }
          break;
        case "boxedShortValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Short> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                map.put(entry.getKey(), ((Number)entry.getValue()).shortValue());
            });
            obj.setBoxedShortValueMap(map);
          }
          break;
        case "boxedShortValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Short> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).shortValue());
            });
            obj.setBoxedShortValues(list);
          }
          break;
        case "buffer":
          if (member.getValue() instanceof String) {
            obj.setBuffer(io.vertx.core.buffer.Buffer.buffer(java.util.Base64.getDecoder().decode((String)member.getValue())));
          }
          break;
        case "bufferMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, io.vertx.core.buffer.Buffer> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof String)
                map.put(entry.getKey(), io.vertx.core.buffer.Buffer.buffer(java.util.Base64.getDecoder().decode((String)entry.getValue())));
            });
            obj.setBufferMap(map);
          }
          break;
        case "bufferSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<io.vertx.core.buffer.Buffer> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.buffer.Buffer.buffer(java.util.Base64.getDecoder().decode((String)item)));
            });
            obj.setBufferSet(list);
          }
          break;
        case "buffers":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.buffer.Buffer.buffer(java.util.Base64.getDecoder().decode((String)item)));
            });
            obj.setBuffers(list);
          }
          break;
        case "byteValue":
          if (member.getValue() instanceof Number) {
            obj.setByteValue(((Number)member.getValue()).byteValue());
          }
          break;
        case "charValue":
          if (member.getValue() instanceof String) {
            obj.setCharValue(((String)member.getValue()).charAt(0));
          }
          break;
        case "doubleValue":
          if (member.getValue() instanceof Number) {
            obj.setDoubleValue(((Number)member.getValue()).doubleValue());
          }
          break;
        case "floatValue":
          if (member.getValue() instanceof Number) {
            obj.setFloatValue(((Number)member.getValue()).floatValue());
          }
          break;
        case "httpMethod":
          if (member.getValue() instanceof String) {
            obj.setHttpMethod(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
        case "httpMethodMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.util.concurrent.TimeUnit> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof String)
                map.put(entry.getKey(), java.util.concurrent.TimeUnit.valueOf((String)entry.getValue()));
            });
            obj.setHttpMethodMap(map);
          }
          break;
        case "httpMethodSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.util.concurrent.TimeUnit> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(java.util.concurrent.TimeUnit.valueOf((String)item));
            });
            obj.setHttpMethodSet(list);
          }
          break;
        case "httpMethods":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.util.concurrent.TimeUnit> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(java.util.concurrent.TimeUnit.valueOf((String)item));
            });
            obj.setHttpMethods(list);
          }
          break;
        case "intValue":
          if (member.getValue() instanceof Number) {
            obj.setIntValue(((Number)member.getValue()).intValue());
          }
          break;
        case "jsonArray":
          if (member.getValue() instanceof JsonArray) {
            obj.setJsonArray(((JsonArray)member.getValue()).copy());
          }
          break;
        case "jsonArrayMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, io.vertx.core.json.JsonArray> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof JsonArray)
                map.put(entry.getKey(), ((JsonArray)entry.getValue()).copy());
            });
            obj.setJsonArrayMap(map);
          }
          break;
        case "jsonArraySet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<io.vertx.core.json.JsonArray> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonArray)
                list.add(((JsonArray)item).copy());
            });
            obj.setJsonArraySet(list);
          }
          break;
        case "jsonArrays":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.json.JsonArray> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonArray)
                list.add(((JsonArray)item).copy());
            });
            obj.setJsonArrays(list);
          }
          break;
        case "jsonObject":
          if (member.getValue() instanceof JsonObject) {
            obj.setJsonObject(((JsonObject)member.getValue()).copy());
          }
          break;
        case "jsonObjectMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, io.vertx.core.json.JsonObject> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof JsonObject)
                map.put(entry.getKey(), ((JsonObject)entry.getValue()).copy());
            });
            obj.setJsonObjectMap(map);
          }
          break;
        case "jsonObjectSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<io.vertx.core.json.JsonObject> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(((JsonObject)item).copy());
            });
            obj.setJsonObjectSet(list);
          }
          break;
        case "jsonObjects":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.json.JsonObject> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(((JsonObject)item).copy());
            });
            obj.setJsonObjects(list);
          }
          break;
        case "keyedBoxedBooleanValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Boolean)
                obj.addKeyedBoxedBooleanValue(entry.getKey(), (Boolean)entry.getValue());
            });
          }
          break;
        case "keyedBoxedByteValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                obj.addKeyedBoxedByteValue(entry.getKey(), ((Number)entry.getValue()).byteValue());
            });
          }
          break;
        case "keyedBoxedCharValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof String)
                obj.addKeyedBoxedCharValue(entry.getKey(), ((String)entry.getValue()).charAt(0));
            });
          }
          break;
        case "keyedBoxedDoubleValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                obj.addKeyedBoxedDoubleValue(entry.getKey(), ((Number)entry.getValue()).doubleValue());
            });
          }
          break;
        case "keyedBoxedFloatValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                obj.addKeyedBoxedFloatValue(entry.getKey(), ((Number)entry.getValue()).floatValue());
            });
          }
          break;
        case "keyedBoxedIntValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                obj.addKeyedBoxedIntValue(entry.getKey(), ((Number)entry.getValue()).intValue());
            });
          }
          break;
        case "keyedBoxedLongValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                obj.addKeyedBoxedLongValue(entry.getKey(), ((Number)entry.getValue()).longValue());
            });
          }
          break;
        case "keyedBoxedShortValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Number)
                obj.addKeyedBoxedShortValue(entry.getKey(), ((Number)entry.getValue()).shortValue());
            });
          }
          break;
        case "keyedBufferValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof String)
                obj.addKeyedBufferValue(entry.getKey(), io.vertx.core.buffer.Buffer.buffer(java.util.Base64.getDecoder().decode((String)entry.getValue())));
            });
          }
          break;
        case "keyedDataObjectValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof JsonObject)
                obj.addKeyedDataObjectValue(entry.getKey(), new io.vertx.test.codegen.converter.AggregatedDataObject((JsonObject)entry.getValue()));
            });
          }
          break;
        case "keyedEnumValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof String)
                obj.addKeyedEnumValue(entry.getKey(), java.util.concurrent.TimeUnit.valueOf((String)entry.getValue()));
            });
          }
          break;
        case "keyedJsonArrayValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof JsonArray)
                obj.addKeyedJsonArrayValue(entry.getKey(), ((JsonArray)entry.getValue()).copy());
            });
          }
          break;
        case "keyedJsonObjectValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof JsonObject)
                obj.addKeyedJsonObjectValue(entry.getKey(), ((JsonObject)entry.getValue()).copy());
            });
          }
          break;
        case "keyedObjectValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Object)
                obj.addKeyedObjectValue(entry.getKey(), entry.getValue());
            });
          }
          break;
        case "keyedStringValues":
          if (member.getValue() instanceof JsonObject) {
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof String)
                obj.addKeyedStringValue(entry.getKey(), (String)entry.getValue());
            });
          }
          break;
        case "longValue":
          if (member.getValue() instanceof Number) {
            obj.setLongValue(((Number)member.getValue()).longValue());
          }
          break;
        case "objectMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.Object> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof Object)
                map.put(entry.getKey(), entry.getValue());
            });
            obj.setObjectMap(map);
          }
          break;
        case "objectSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Object> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Object)
                list.add(item);
            });
            obj.setObjectSet(list);
          }
          break;
        case "objects":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.Object> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Object)
                list.add(item);
            });
            obj.setObjects(list);
          }
          break;
        case "shortValue":
          if (member.getValue() instanceof Number) {
            obj.setShortValue(((Number)member.getValue()).shortValue());
          }
          break;
        case "stringSet":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
            });
            obj.setStringSet(list);
          }
          break;
        case "stringValue":
          if (member.getValue() instanceof String) {
            obj.setStringValue((String)member.getValue());
          }
          break;
        case "stringValueMap":
          if (member.getValue() instanceof JsonObject) {
            java.util.Map<String, java.lang.String> map = new java.util.LinkedHashMap<>();
            ((Iterable<java.util.Map.Entry<String, Object>>)member.getValue()).forEach(entry -> {
              if (entry.getValue() instanceof String)
                map.put(entry.getKey(), (String)entry.getValue());
            });
            obj.setStringValueMap(map);
          }
          break;
        case "stringValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
            });
            obj.setStringValues(list);
          }
          break;
      }
    }
  }

  public static void toJson(TestDataObject obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(TestDataObject obj, java.util.Map<String, Object> json) {
    if (obj.getAddedAggregatedDataObjects() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedAggregatedDataObjects().forEach(item -> array.add(item.toJson()));
      json.put("addedAggregatedDataObjects", array);
    }
    if (obj.getAddedBoxedBooleanValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBoxedBooleanValues().forEach(item -> array.add(item));
      json.put("addedBoxedBooleanValues", array);
    }
    if (obj.getAddedBoxedByteValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBoxedByteValues().forEach(item -> array.add(item));
      json.put("addedBoxedByteValues", array);
    }
    if (obj.getAddedBoxedCharValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBoxedCharValues().forEach(item -> array.add(Character.toString(item)));
      json.put("addedBoxedCharValues", array);
    }
    if (obj.getAddedBoxedDoubleValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBoxedDoubleValues().forEach(item -> array.add(item));
      json.put("addedBoxedDoubleValues", array);
    }
    if (obj.getAddedBoxedFloatValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBoxedFloatValues().forEach(item -> array.add(item));
      json.put("addedBoxedFloatValues", array);
    }
    if (obj.getAddedBoxedIntValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBoxedIntValues().forEach(item -> array.add(item));
      json.put("addedBoxedIntValues", array);
    }
    if (obj.getAddedBoxedLongValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBoxedLongValues().forEach(item -> array.add(item));
      json.put("addedBoxedLongValues", array);
    }
    if (obj.getAddedBoxedShortValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBoxedShortValues().forEach(item -> array.add(item));
      json.put("addedBoxedShortValues", array);
    }
    if (obj.getAddedBuffers() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedBuffers().forEach(item -> array.add(java.util.Base64.getEncoder().encodeToString(item.getBytes())));
      json.put("addedBuffers", array);
    }
    if (obj.getAddedHttpMethods() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedHttpMethods().forEach(item -> array.add(item.name()));
      json.put("addedHttpMethods", array);
    }
    if (obj.getAddedJsonArrays() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedJsonArrays().forEach(item -> array.add(item));
      json.put("addedJsonArrays", array);
    }
    if (obj.getAddedJsonObjects() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedJsonObjects().forEach(item -> array.add(item));
      json.put("addedJsonObjects", array);
    }
    if (obj.getAddedObjects() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedObjects().forEach(item -> array.add(item));
      json.put("addedObjects", array);
    }
    if (obj.getAddedStringValues() != null) {
      JsonArray array = new JsonArray();
      obj.getAddedStringValues().forEach(item -> array.add(item));
      json.put("addedStringValues", array);
    }
    if (obj.getAggregatedDataObject() != null) {
      json.put("aggregatedDataObject", obj.getAggregatedDataObject().toJson());
    }
    if (obj.getAggregatedDataObjectMap() != null) {
      JsonObject map = new JsonObject();
      obj.getAggregatedDataObjectMap().forEach((key, value) -> map.put(key, value.toJson()));
      json.put("aggregatedDataObjectMap", map);
    }
    if (obj.getAggregatedDataObjectSet() != null) {
      JsonArray array = new JsonArray();
      obj.getAggregatedDataObjectSet().forEach(item -> array.add(item.toJson()));
      json.put("aggregatedDataObjectSet", array);
    }
    if (obj.getAggregatedDataObjects() != null) {
      JsonArray array = new JsonArray();
      obj.getAggregatedDataObjects().forEach(item -> array.add(item.toJson()));
      json.put("aggregatedDataObjects", array);
    }
    json.put("booleanValue", obj.isBooleanValue());
    if (obj.getBoxedBooleanSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedBooleanSet().forEach(item -> array.add(item));
      json.put("boxedBooleanSet", array);
    }
    if (obj.isBoxedBooleanValue() != null) {
      json.put("boxedBooleanValue", obj.isBoxedBooleanValue());
    }
    if (obj.getBoxedBooleanValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBoxedBooleanValueMap().forEach((key, value) -> map.put(key, value));
      json.put("boxedBooleanValueMap", map);
    }
    if (obj.getBoxedBooleanValues() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedBooleanValues().forEach(item -> array.add(item));
      json.put("boxedBooleanValues", array);
    }
    if (obj.getBoxedByteSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedByteSet().forEach(item -> array.add(item));
      json.put("boxedByteSet", array);
    }
    if (obj.getBoxedByteValue() != null) {
      json.put("boxedByteValue", obj.getBoxedByteValue());
    }
    if (obj.getBoxedByteValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBoxedByteValueMap().forEach((key, value) -> map.put(key, value));
      json.put("boxedByteValueMap", map);
    }
    if (obj.getBoxedByteValues() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedByteValues().forEach(item -> array.add(item));
      json.put("boxedByteValues", array);
    }
    if (obj.getBoxedCharSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedCharSet().forEach(item -> array.add(Character.toString(item)));
      json.put("boxedCharSet", array);
    }
    if (obj.getBoxedCharValue() != null) {
      json.put("boxedCharValue", Character.toString(obj.getBoxedCharValue()));
    }
    if (obj.getBoxedCharValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBoxedCharValueMap().forEach((key, value) -> map.put(key, Character.toString(value)));
      json.put("boxedCharValueMap", map);
    }
    if (obj.getBoxedCharValues() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedCharValues().forEach(item -> array.add(Character.toString(item)));
      json.put("boxedCharValues", array);
    }
    if (obj.getBoxedDoubleSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedDoubleSet().forEach(item -> array.add(item));
      json.put("boxedDoubleSet", array);
    }
    if (obj.getBoxedDoubleValue() != null) {
      json.put("boxedDoubleValue", obj.getBoxedDoubleValue());
    }
    if (obj.getBoxedDoubleValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBoxedDoubleValueMap().forEach((key, value) -> map.put(key, value));
      json.put("boxedDoubleValueMap", map);
    }
    if (obj.getBoxedDoubleValues() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedDoubleValues().forEach(item -> array.add(item));
      json.put("boxedDoubleValues", array);
    }
    if (obj.getBoxedFloatSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedFloatSet().forEach(item -> array.add(item));
      json.put("boxedFloatSet", array);
    }
    if (obj.getBoxedFloatValue() != null) {
      json.put("boxedFloatValue", obj.getBoxedFloatValue());
    }
    if (obj.getBoxedFloatValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBoxedFloatValueMap().forEach((key, value) -> map.put(key, value));
      json.put("boxedFloatValueMap", map);
    }
    if (obj.getBoxedFloatValues() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedFloatValues().forEach(item -> array.add(item));
      json.put("boxedFloatValues", array);
    }
    if (obj.getBoxedIntSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedIntSet().forEach(item -> array.add(item));
      json.put("boxedIntSet", array);
    }
    if (obj.getBoxedIntValue() != null) {
      json.put("boxedIntValue", obj.getBoxedIntValue());
    }
    if (obj.getBoxedIntValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBoxedIntValueMap().forEach((key, value) -> map.put(key, value));
      json.put("boxedIntValueMap", map);
    }
    if (obj.getBoxedIntValues() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedIntValues().forEach(item -> array.add(item));
      json.put("boxedIntValues", array);
    }
    if (obj.getBoxedLongSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedLongSet().forEach(item -> array.add(item));
      json.put("boxedLongSet", array);
    }
    if (obj.getBoxedLongValue() != null) {
      json.put("boxedLongValue", obj.getBoxedLongValue());
    }
    if (obj.getBoxedLongValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBoxedLongValueMap().forEach((key, value) -> map.put(key, value));
      json.put("boxedLongValueMap", map);
    }
    if (obj.getBoxedLongValues() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedLongValues().forEach(item -> array.add(item));
      json.put("boxedLongValues", array);
    }
    if (obj.getBoxedShortSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedShortSet().forEach(item -> array.add(item));
      json.put("boxedShortSet", array);
    }
    if (obj.getBoxedShortValue() != null) {
      json.put("boxedShortValue", obj.getBoxedShortValue());
    }
    if (obj.getBoxedShortValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBoxedShortValueMap().forEach((key, value) -> map.put(key, value));
      json.put("boxedShortValueMap", map);
    }
    if (obj.getBoxedShortValues() != null) {
      JsonArray array = new JsonArray();
      obj.getBoxedShortValues().forEach(item -> array.add(item));
      json.put("boxedShortValues", array);
    }
    if (obj.getBuffer() != null) {
      json.put("buffer", java.util.Base64.getEncoder().encodeToString(obj.getBuffer().getBytes()));
    }
    if (obj.getBufferMap() != null) {
      JsonObject map = new JsonObject();
      obj.getBufferMap().forEach((key, value) -> map.put(key, java.util.Base64.getEncoder().encodeToString(value.getBytes())));
      json.put("bufferMap", map);
    }
    if (obj.getBufferSet() != null) {
      JsonArray array = new JsonArray();
      obj.getBufferSet().forEach(item -> array.add(java.util.Base64.getEncoder().encodeToString(item.getBytes())));
      json.put("bufferSet", array);
    }
    if (obj.getBuffers() != null) {
      JsonArray array = new JsonArray();
      obj.getBuffers().forEach(item -> array.add(java.util.Base64.getEncoder().encodeToString(item.getBytes())));
      json.put("buffers", array);
    }
    json.put("byteValue", obj.getByteValue());
    json.put("charValue", Character.toString(obj.getCharValue()));
    json.put("doubleValue", obj.getDoubleValue());
    json.put("floatValue", obj.getFloatValue());
    if (obj.getHttpMethod() != null) {
      json.put("httpMethod", obj.getHttpMethod().name());
    }
    if (obj.getHttpMethodMap() != null) {
      JsonObject map = new JsonObject();
      obj.getHttpMethodMap().forEach((key, value) -> map.put(key, value.name()));
      json.put("httpMethodMap", map);
    }
    if (obj.getHttpMethodSet() != null) {
      JsonArray array = new JsonArray();
      obj.getHttpMethodSet().forEach(item -> array.add(item.name()));
      json.put("httpMethodSet", array);
    }
    if (obj.getHttpMethods() != null) {
      JsonArray array = new JsonArray();
      obj.getHttpMethods().forEach(item -> array.add(item.name()));
      json.put("httpMethods", array);
    }
    json.put("intValue", obj.getIntValue());
    if (obj.getJsonArray() != null) {
      json.put("jsonArray", obj.getJsonArray());
    }
    if (obj.getJsonArrayMap() != null) {
      JsonObject map = new JsonObject();
      obj.getJsonArrayMap().forEach((key, value) -> map.put(key, value));
      json.put("jsonArrayMap", map);
    }
    if (obj.getJsonArraySet() != null) {
      JsonArray array = new JsonArray();
      obj.getJsonArraySet().forEach(item -> array.add(item));
      json.put("jsonArraySet", array);
    }
    if (obj.getJsonArrays() != null) {
      JsonArray array = new JsonArray();
      obj.getJsonArrays().forEach(item -> array.add(item));
      json.put("jsonArrays", array);
    }
    if (obj.getJsonObject() != null) {
      json.put("jsonObject", obj.getJsonObject());
    }
    if (obj.getJsonObjectMap() != null) {
      JsonObject map = new JsonObject();
      obj.getJsonObjectMap().forEach((key, value) -> map.put(key, value));
      json.put("jsonObjectMap", map);
    }
    if (obj.getJsonObjectSet() != null) {
      JsonArray array = new JsonArray();
      obj.getJsonObjectSet().forEach(item -> array.add(item));
      json.put("jsonObjectSet", array);
    }
    if (obj.getJsonObjects() != null) {
      JsonArray array = new JsonArray();
      obj.getJsonObjects().forEach(item -> array.add(item));
      json.put("jsonObjects", array);
    }
    if (obj.getKeyedBoxedBooleanValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBoxedBooleanValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedBoxedBooleanValues", map);
    }
    if (obj.getKeyedBoxedByteValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBoxedByteValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedBoxedByteValues", map);
    }
    if (obj.getKeyedBoxedCharValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBoxedCharValues().forEach((key, value) -> map.put(key, Character.toString(value)));
      json.put("keyedBoxedCharValues", map);
    }
    if (obj.getKeyedBoxedDoubleValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBoxedDoubleValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedBoxedDoubleValues", map);
    }
    if (obj.getKeyedBoxedFloatValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBoxedFloatValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedBoxedFloatValues", map);
    }
    if (obj.getKeyedBoxedIntValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBoxedIntValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedBoxedIntValues", map);
    }
    if (obj.getKeyedBoxedLongValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBoxedLongValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedBoxedLongValues", map);
    }
    if (obj.getKeyedBoxedShortValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBoxedShortValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedBoxedShortValues", map);
    }
    if (obj.getKeyedBufferValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedBufferValues().forEach((key, value) -> map.put(key, java.util.Base64.getEncoder().encodeToString(value.getBytes())));
      json.put("keyedBufferValues", map);
    }
    if (obj.getKeyedDataObjectValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedDataObjectValues().forEach((key, value) -> map.put(key, value.toJson()));
      json.put("keyedDataObjectValues", map);
    }
    if (obj.getKeyedEnumValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedEnumValues().forEach((key, value) -> map.put(key, value.name()));
      json.put("keyedEnumValues", map);
    }
    if (obj.getKeyedJsonArrayValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedJsonArrayValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedJsonArrayValues", map);
    }
    if (obj.getKeyedJsonObjectValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedJsonObjectValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedJsonObjectValues", map);
    }
    if (obj.getKeyedObjectValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedObjectValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedObjectValues", map);
    }
    if (obj.getKeyedStringValues() != null) {
      JsonObject map = new JsonObject();
      obj.getKeyedStringValues().forEach((key, value) -> map.put(key, value));
      json.put("keyedStringValues", map);
    }
    json.put("longValue", obj.getLongValue());
    if (obj.getObjectMap() != null) {
      JsonObject map = new JsonObject();
      obj.getObjectMap().forEach((key, value) -> map.put(key, value));
      json.put("objectMap", map);
    }
    if (obj.getObjectSet() != null) {
      JsonArray array = new JsonArray();
      obj.getObjectSet().forEach(item -> array.add(item));
      json.put("objectSet", array);
    }
    if (obj.getObjects() != null) {
      JsonArray array = new JsonArray();
      obj.getObjects().forEach(item -> array.add(item));
      json.put("objects", array);
    }
    json.put("shortValue", obj.getShortValue());
    if (obj.getStringSet() != null) {
      JsonArray array = new JsonArray();
      obj.getStringSet().forEach(item -> array.add(item));
      json.put("stringSet", array);
    }
    if (obj.getStringValue() != null) {
      json.put("stringValue", obj.getStringValue());
    }
    if (obj.getStringValueMap() != null) {
      JsonObject map = new JsonObject();
      obj.getStringValueMap().forEach((key, value) -> map.put(key, value));
      json.put("stringValueMap", map);
    }
    if (obj.getStringValues() != null) {
      JsonArray array = new JsonArray();
      obj.getStringValues().forEach(item -> array.add(item));
      json.put("stringValues", array);
    }
  }

    public static boolean equals(TestDataObject lhs, TestDataObject rhs) {
        if (lhs == rhs) {
          return true;
        }

        return Objects.equals(lhs.getAddedAggregatedDataObjects(), rhs.getAddedAggregatedDataObjects()) &&
            Objects.equals(lhs.getAddedBoxedBooleanValues(), rhs.getAddedBoxedBooleanValues()) &&
            Objects.equals(lhs.getAddedBoxedByteValues(), rhs.getAddedBoxedByteValues()) &&
            Objects.equals(lhs.getAddedBoxedCharValues(), rhs.getAddedBoxedCharValues()) &&
            Objects.equals(lhs.getAddedBoxedDoubleValues(), rhs.getAddedBoxedDoubleValues()) &&
            Objects.equals(lhs.getAddedBoxedFloatValues(), rhs.getAddedBoxedFloatValues()) &&
            Objects.equals(lhs.getAddedBoxedIntValues(), rhs.getAddedBoxedIntValues()) &&
            Objects.equals(lhs.getAddedBoxedLongValues(), rhs.getAddedBoxedLongValues()) &&
            Objects.equals(lhs.getAddedBoxedShortValues(), rhs.getAddedBoxedShortValues()) &&
            Objects.equals(lhs.getAddedBuffers(), rhs.getAddedBuffers()) &&
            Objects.equals(lhs.getAddedHttpMethods(), rhs.getAddedHttpMethods()) &&
            Objects.equals(lhs.getAddedJsonArrays(), rhs.getAddedJsonArrays()) &&
            Objects.equals(lhs.getAddedJsonObjects(), rhs.getAddedJsonObjects()) &&
            Objects.equals(lhs.getAddedObjects(), rhs.getAddedObjects()) &&
            Objects.equals(lhs.getAddedStringValues(), rhs.getAddedStringValues()) &&
            Objects.equals(lhs.getAggregatedDataObject(), rhs.getAggregatedDataObject()) &&
            Objects.equals(lhs.getAggregatedDataObjectMap(), rhs.getAggregatedDataObjectMap()) &&
            Objects.equals(lhs.getAggregatedDataObjectSet(), rhs.getAggregatedDataObjectSet()) &&
            Objects.equals(lhs.getAggregatedDataObjects(), rhs.getAggregatedDataObjects()) &&
            Objects.equals(lhs.isBooleanValue(), rhs.isBooleanValue()) &&
            Objects.equals(lhs.getBoxedBooleanSet(), rhs.getBoxedBooleanSet()) &&
            Objects.equals(lhs.isBoxedBooleanValue(), rhs.isBoxedBooleanValue()) &&
            Objects.equals(lhs.getBoxedBooleanValueMap(), rhs.getBoxedBooleanValueMap()) &&
            Objects.equals(lhs.getBoxedBooleanValues(), rhs.getBoxedBooleanValues()) &&
            Objects.equals(lhs.getBoxedByteSet(), rhs.getBoxedByteSet()) &&
            Objects.equals(lhs.getBoxedByteValue(), rhs.getBoxedByteValue()) &&
            Objects.equals(lhs.getBoxedByteValueMap(), rhs.getBoxedByteValueMap()) &&
            Objects.equals(lhs.getBoxedByteValues(), rhs.getBoxedByteValues()) &&
            Objects.equals(lhs.getBoxedCharSet(), rhs.getBoxedCharSet()) &&
            Objects.equals(lhs.getBoxedCharValue(), rhs.getBoxedCharValue()) &&
            Objects.equals(lhs.getBoxedCharValueMap(), rhs.getBoxedCharValueMap()) &&
            Objects.equals(lhs.getBoxedCharValues(), rhs.getBoxedCharValues()) &&
            Objects.equals(lhs.getBoxedDoubleSet(), rhs.getBoxedDoubleSet()) &&
            Objects.equals(lhs.getBoxedDoubleValue(), rhs.getBoxedDoubleValue()) &&
            Objects.equals(lhs.getBoxedDoubleValueMap(), rhs.getBoxedDoubleValueMap()) &&
            Objects.equals(lhs.getBoxedDoubleValues(), rhs.getBoxedDoubleValues()) &&
            Objects.equals(lhs.getBoxedFloatSet(), rhs.getBoxedFloatSet()) &&
            Objects.equals(lhs.getBoxedFloatValue(), rhs.getBoxedFloatValue()) &&
            Objects.equals(lhs.getBoxedFloatValueMap(), rhs.getBoxedFloatValueMap()) &&
            Objects.equals(lhs.getBoxedFloatValues(), rhs.getBoxedFloatValues()) &&
            Objects.equals(lhs.getBoxedIntSet(), rhs.getBoxedIntSet()) &&
            Objects.equals(lhs.getBoxedIntValue(), rhs.getBoxedIntValue()) &&
            Objects.equals(lhs.getBoxedIntValueMap(), rhs.getBoxedIntValueMap()) &&
            Objects.equals(lhs.getBoxedIntValues(), rhs.getBoxedIntValues()) &&
            Objects.equals(lhs.getBoxedLongSet(), rhs.getBoxedLongSet()) &&
            Objects.equals(lhs.getBoxedLongValue(), rhs.getBoxedLongValue()) &&
            Objects.equals(lhs.getBoxedLongValueMap(), rhs.getBoxedLongValueMap()) &&
            Objects.equals(lhs.getBoxedLongValues(), rhs.getBoxedLongValues()) &&
            Objects.equals(lhs.getBoxedShortSet(), rhs.getBoxedShortSet()) &&
            Objects.equals(lhs.getBoxedShortValue(), rhs.getBoxedShortValue()) &&
            Objects.equals(lhs.getBoxedShortValueMap(), rhs.getBoxedShortValueMap()) &&
            Objects.equals(lhs.getBoxedShortValues(), rhs.getBoxedShortValues()) &&
            Objects.equals(lhs.getBuffer(), rhs.getBuffer()) &&
            Objects.equals(lhs.getBufferMap(), rhs.getBufferMap()) &&
            Objects.equals(lhs.getBufferSet(), rhs.getBufferSet()) &&
            Objects.equals(lhs.getBuffers(), rhs.getBuffers()) &&
            Objects.equals(lhs.getByteValue(), rhs.getByteValue()) &&
            Objects.equals(lhs.getCharValue(), rhs.getCharValue()) &&
            Objects.equals(lhs.getDoubleValue(), rhs.getDoubleValue()) &&
            Objects.equals(lhs.getFloatValue(), rhs.getFloatValue()) &&
            Objects.equals(lhs.getHttpMethod(), rhs.getHttpMethod()) &&
            Objects.equals(lhs.getHttpMethodMap(), rhs.getHttpMethodMap()) &&
            Objects.equals(lhs.getHttpMethodSet(), rhs.getHttpMethodSet()) &&
            Objects.equals(lhs.getHttpMethods(), rhs.getHttpMethods()) &&
            Objects.equals(lhs.getIntValue(), rhs.getIntValue()) &&
            Objects.equals(lhs.getJsonArray(), rhs.getJsonArray()) &&
            Objects.equals(lhs.getJsonArrayMap(), rhs.getJsonArrayMap()) &&
            Objects.equals(lhs.getJsonArraySet(), rhs.getJsonArraySet()) &&
            Objects.equals(lhs.getJsonArrays(), rhs.getJsonArrays()) &&
            Objects.equals(lhs.getJsonObject(), rhs.getJsonObject()) &&
            Objects.equals(lhs.getJsonObjectMap(), rhs.getJsonObjectMap()) &&
            Objects.equals(lhs.getJsonObjectSet(), rhs.getJsonObjectSet()) &&
            Objects.equals(lhs.getJsonObjects(), rhs.getJsonObjects()) &&
            Objects.equals(lhs.getKeyedBoxedBooleanValues(), rhs.getKeyedBoxedBooleanValues()) &&
            Objects.equals(lhs.getKeyedBoxedByteValues(), rhs.getKeyedBoxedByteValues()) &&
            Objects.equals(lhs.getKeyedBoxedCharValues(), rhs.getKeyedBoxedCharValues()) &&
            Objects.equals(lhs.getKeyedBoxedDoubleValues(), rhs.getKeyedBoxedDoubleValues()) &&
            Objects.equals(lhs.getKeyedBoxedFloatValues(), rhs.getKeyedBoxedFloatValues()) &&
            Objects.equals(lhs.getKeyedBoxedIntValues(), rhs.getKeyedBoxedIntValues()) &&
            Objects.equals(lhs.getKeyedBoxedLongValues(), rhs.getKeyedBoxedLongValues()) &&
            Objects.equals(lhs.getKeyedBoxedShortValues(), rhs.getKeyedBoxedShortValues()) &&
            Objects.equals(lhs.getKeyedBufferValues(), rhs.getKeyedBufferValues()) &&
            Objects.equals(lhs.getKeyedDataObjectValues(), rhs.getKeyedDataObjectValues()) &&
            Objects.equals(lhs.getKeyedEnumValues(), rhs.getKeyedEnumValues()) &&
            Objects.equals(lhs.getKeyedJsonArrayValues(), rhs.getKeyedJsonArrayValues()) &&
            Objects.equals(lhs.getKeyedJsonObjectValues(), rhs.getKeyedJsonObjectValues()) &&
            Objects.equals(lhs.getKeyedObjectValues(), rhs.getKeyedObjectValues()) &&
            Objects.equals(lhs.getKeyedStringValues(), rhs.getKeyedStringValues()) &&
            Objects.equals(lhs.getLongValue(), rhs.getLongValue()) &&
            Objects.equals(lhs.getObjectMap(), rhs.getObjectMap()) &&
            Objects.equals(lhs.getObjectSet(), rhs.getObjectSet()) &&
            Objects.equals(lhs.getObjects(), rhs.getObjects()) &&
            Objects.equals(lhs.getShortValue(), rhs.getShortValue()) &&
            Objects.equals(lhs.getStringSet(), rhs.getStringSet()) &&
            Objects.equals(lhs.getStringValue(), rhs.getStringValue()) &&
            Objects.equals(lhs.getStringValueMap(), rhs.getStringValueMap()) &&
            Objects.equals(lhs.getStringValues(), rhs.getStringValues());
    }


    public static int hashCode(TestDataObject o) {
        return Objects.hash(
                o.getAddedAggregatedDataObjects(),
                o.getAddedBoxedBooleanValues(),
                o.getAddedBoxedByteValues(),
                o.getAddedBoxedCharValues(),
                o.getAddedBoxedDoubleValues(),
                o.getAddedBoxedFloatValues(),
                o.getAddedBoxedIntValues(),
                o.getAddedBoxedLongValues(),
                o.getAddedBoxedShortValues(),
                o.getAddedBuffers(),
                o.getAddedHttpMethods(),
                o.getAddedJsonArrays(),
                o.getAddedJsonObjects(),
                o.getAddedObjects(),
                o.getAddedStringValues(),
                o.getAggregatedDataObject(),
                o.getAggregatedDataObjectMap(),
                o.getAggregatedDataObjectSet(),
                o.getAggregatedDataObjects(),
                o.isBooleanValue(),
                o.getBoxedBooleanSet(),
                o.isBoxedBooleanValue(),
                o.getBoxedBooleanValueMap(),
                o.getBoxedBooleanValues(),
                o.getBoxedByteSet(),
                o.getBoxedByteValue(),
                o.getBoxedByteValueMap(),
                o.getBoxedByteValues(),
                o.getBoxedCharSet(),
                o.getBoxedCharValue(),
                o.getBoxedCharValueMap(),
                o.getBoxedCharValues(),
                o.getBoxedDoubleSet(),
                o.getBoxedDoubleValue(),
                o.getBoxedDoubleValueMap(),
                o.getBoxedDoubleValues(),
                o.getBoxedFloatSet(),
                o.getBoxedFloatValue(),
                o.getBoxedFloatValueMap(),
                o.getBoxedFloatValues(),
                o.getBoxedIntSet(),
                o.getBoxedIntValue(),
                o.getBoxedIntValueMap(),
                o.getBoxedIntValues(),
                o.getBoxedLongSet(),
                o.getBoxedLongValue(),
                o.getBoxedLongValueMap(),
                o.getBoxedLongValues(),
                o.getBoxedShortSet(),
                o.getBoxedShortValue(),
                o.getBoxedShortValueMap(),
                o.getBoxedShortValues(),
                o.getBuffer(),
                o.getBufferMap(),
                o.getBufferSet(),
                o.getBuffers(),
                o.getByteValue(),
                o.getCharValue(),
                o.getDoubleValue(),
                o.getFloatValue(),
                o.getHttpMethod(),
                o.getHttpMethodMap(),
                o.getHttpMethodSet(),
                o.getHttpMethods(),
                o.getIntValue(),
                o.getJsonArray(),
                o.getJsonArrayMap(),
                o.getJsonArraySet(),
                o.getJsonArrays(),
                o.getJsonObject(),
                o.getJsonObjectMap(),
                o.getJsonObjectSet(),
                o.getJsonObjects(),
                o.getKeyedBoxedBooleanValues(),
                o.getKeyedBoxedByteValues(),
                o.getKeyedBoxedCharValues(),
                o.getKeyedBoxedDoubleValues(),
                o.getKeyedBoxedFloatValues(),
                o.getKeyedBoxedIntValues(),
                o.getKeyedBoxedLongValues(),
                o.getKeyedBoxedShortValues(),
                o.getKeyedBufferValues(),
                o.getKeyedDataObjectValues(),
                o.getKeyedEnumValues(),
                o.getKeyedJsonArrayValues(),
                o.getKeyedJsonObjectValues(),
                o.getKeyedObjectValues(),
                o.getKeyedStringValues(),
                o.getLongValue(),
                o.getObjectMap(),
                o.getObjectSet(),
                o.getObjects(),
                o.getShortValue(),
                o.getStringSet(),
                o.getStringValue(),
                o.getStringValueMap(),
                o.getStringValues());
    }
}
