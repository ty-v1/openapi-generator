/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.openapitools.client.model.AppleReq;
import org.openapitools.client.model.BananaReq;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FruitReq extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FruitReq.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FruitReq.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FruitReq' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AppleReq> adapterAppleReq = gson.getDelegateAdapter(this, TypeToken.get(AppleReq.class));
            final TypeAdapter<BananaReq> adapterBananaReq = gson.getDelegateAdapter(this, TypeToken.get(BananaReq.class));

            return (TypeAdapter<T>) new TypeAdapter<FruitReq>() {
                @Override
                public void write(JsonWriter out, FruitReq value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AppleReq`
                    if (value.getActualInstance() instanceof AppleReq) {
                        JsonObject obj = adapterAppleReq.toJsonTree((AppleReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `BananaReq`
                    if (value.getActualInstance() instanceof BananaReq) {
                        JsonObject obj = adapterBananaReq.toJsonTree((BananaReq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AppleReq, BananaReq");
                }

                @Override
                public FruitReq read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AppleReq
                    try {
                        // validate the JSON object to see if any excpetion is thrown
                        AppleReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterAppleReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AppleReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'AppleReq'", e);
                    }

                    // deserialize BananaReq
                    try {
                        // validate the JSON object to see if any excpetion is thrown
                        BananaReq.validateJsonObject(jsonObject);
                        actualAdapter = adapterBananaReq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BananaReq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'BananaReq'", e);
                    }

                    if (match == 1) {
                        FruitReq ret = new FruitReq();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for FruitReq: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public FruitReq() {
        super("oneOf", Boolean.TRUE);
    }

    public FruitReq(AppleReq o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }

    public FruitReq(BananaReq o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppleReq", new GenericType<AppleReq>() {
        });
        schemas.put("BananaReq", new GenericType<BananaReq>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FruitReq.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppleReq, BananaReq
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance == null) {
           super.setActualInstance(instance);
           return;
        }

        if (instance instanceof AppleReq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BananaReq) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppleReq, BananaReq");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppleReq, BananaReq
     *
     * @return The actual instance (AppleReq, BananaReq)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppleReq`. If the actual instance is not `AppleReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppleReq`
     * @throws ClassCastException if the instance is not `AppleReq`
     */
    public AppleReq getAppleReq() throws ClassCastException {
        return (AppleReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BananaReq`. If the actual instance is not `BananaReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BananaReq`
     * @throws ClassCastException if the instance is not `BananaReq`
     */
    public BananaReq getBananaReq() throws ClassCastException {
        return (BananaReq)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FruitReq
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with AppleReq
    try {
      AppleReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with BananaReq
    try {
      BananaReq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for FruitReq with oneOf schemas: AppleReq, BananaReq. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of FruitReq given an JSON string
  *
  * @param jsonString JSON string 
  * @return An instance of FruitReq
  * @throws IOException if the JSON string is invalid with respect to FruitReq
  */
  public static FruitReq fromJson(String jsonString) throws IOException {
    Gson gson = new JSON().getGson();
    return gson.fromJson(jsonString, FruitReq.class);
  }
}

