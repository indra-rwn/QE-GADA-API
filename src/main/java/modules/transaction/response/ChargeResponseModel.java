package modules.transaction.response;

import modules.BaseModel;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class ChargeResponseModel extends BaseModel<ChargeResponseModel> {

    public Example example;

    @Override
    public ChargeResponseModel getBody() {
        return this;
    }

    public static ChargeResponseModel toModel(String json) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
        return gson.fromJson(json, ChargeResponseModel.class);
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public ChargeResponseModel() {
    }

    public class Example {

        public List<ItemDetail> itemDetails;
        public Long originalAmount;
        public String paymentExpirationDate;
        public Long creationStatus;
        public Long totalAmount;
        public Long transactionId;

        /**
         * No args constructor for use in serialization
         *
         */
        public Example() {
        }

        public Example(List<ItemDetail> itemDetails, Long originalAmount, String paymentExpirationDate, Long creationStatus, Long totalAmount, Long transactionId) {
            super();
            this.itemDetails = itemDetails;
            this.originalAmount = originalAmount;
            this.paymentExpirationDate = paymentExpirationDate;
            this.creationStatus = creationStatus;
            this.totalAmount = totalAmount;
            this.transactionId = transactionId;
        }

    }

    public class ItemDetail {

        public Long itemAmount;
        public String itemDescription;
        public String itemType;

        public ItemDetail() {
        }

        public ItemDetail(Long itemAmount, String itemDescription, String itemType) {
            super();
            this.itemAmount = itemAmount;
            this.itemDescription = itemDescription;
            this.itemType = itemType;
        }
    }
}