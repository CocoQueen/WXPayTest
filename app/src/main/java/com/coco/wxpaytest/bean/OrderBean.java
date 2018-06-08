package com.coco.wxpaytest.bean;

import java.util.List;

/**
 * Created by ydx on 18-6-7.
 */

public class OrderBean {

    /**
     * amount : 0
     * buyerMobile : string
     * buyerName : string
     * comment : {"content":"string","createAt":"2018-06-08T03:31:34.401Z","userAvatarUrl":"string","userId":"string","username":"string"}
     * createAt : 2018-06-08T03:31:34.401Z
     * currency : string
     * deliveryAt : 2018-06-08T03:31:34.401Z
     * deliveryCode : string
     * id : string
     * merchantId : string
     * merchantName : string
     * message : string
     * payChannel : string
     * prices : 0
     * product : {"category":"string","cityName":"string","countryName":"string","cover":["string"],"createAt":"2018-06-08T03:31:34.401Z","currency":"string","deadline":"2018-06-08T03:31:34.401Z","deliveryAddress":"string","deliveryDateFrom":"2018-06-08T03:31:34.401Z","deliveryDateTo":"2018-06-08T03:31:34.401Z","detail":"string","id":"string","inventory":0,"merchant":{"address":"string","category":"string","guide":{"gender":"string","mobile":"string","photo":["string"]},"id":"string","image":"string","info":"string","name":"string","phone":"string","rating":0,"restaurant":{"address":"string","location":{"lat":0,"lon":0},"mobile":"string","openTime":"string","photo":["string"],"style":"string"},"sold":0,"status":"string","type":"string"},"merchantId":"string","originPrice":0,"phone":"string","price":0,"sold":0,"status":"string","title":"string","updateAt":"2018-06-08T03:31:34.401Z"}
     * productId : string
     * productTitle : string
     * rating : 0
     * status : string
     * updateAt : 2018-06-08T03:31:34.401Z
     * userAvatarUrl : string
     * userId : string
     * username : string
     */

    private int amount;
    private String buyerMobile;
    private String buyerName;
    private CommentBean comment;
    private String createAt;
    private String currency;
    private String deliveryAt;
    private String deliveryCode;
    private String id;
    private String merchantId;
    private String merchantName;
    private String message;
    private String payChannel;
    private int prices;
    private ProductBean product;
    private String productId;
    private String productTitle;
    private int rating;
    private String status;
    private String updateAt;
    private String userAvatarUrl;
    private String userId;
    private String username;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public CommentBean getComment() {
        return comment;
    }

    public void setComment(CommentBean comment) {
        this.comment = comment;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDeliveryAt() {
        return deliveryAt;
    }

    public void setDeliveryAt(String deliveryAt) {
        this.deliveryAt = deliveryAt;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public ProductBean getProduct() {
        return product;
    }

    public void setProduct(ProductBean product) {
        this.product = product;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static class CommentBean {
        /**
         * content : string
         * createAt : 2018-06-08T03:31:34.401Z
         * userAvatarUrl : string
         * userId : string
         * username : string
         */

        private String content;
        private String createAt;
        private String userAvatarUrl;
        private String userId;
        private String username;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateAt() {
            return createAt;
        }

        public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }

        public String getUserAvatarUrl() {
            return userAvatarUrl;
        }

        public void setUserAvatarUrl(String userAvatarUrl) {
            this.userAvatarUrl = userAvatarUrl;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class ProductBean {
        /**
         * category : string
         * cityName : string
         * countryName : string
         * cover : ["string"]
         * createAt : 2018-06-08T03:31:34.401Z
         * currency : string
         * deadline : 2018-06-08T03:31:34.401Z
         * deliveryAddress : string
         * deliveryDateFrom : 2018-06-08T03:31:34.401Z
         * deliveryDateTo : 2018-06-08T03:31:34.401Z
         * detail : string
         * id : string
         * inventory : 0
         * merchant : {"address":"string","category":"string","guide":{"gender":"string","mobile":"string","photo":["string"]},"id":"string","image":"string","info":"string","name":"string","phone":"string","rating":0,"restaurant":{"address":"string","location":{"lat":0,"lon":0},"mobile":"string","openTime":"string","photo":["string"],"style":"string"},"sold":0,"status":"string","type":"string"}
         * merchantId : string
         * originPrice : 0
         * phone : string
         * price : 0
         * sold : 0
         * status : string
         * title : string
         * updateAt : 2018-06-08T03:31:34.401Z
         */

        private String category;
        private String cityName;
        private String countryName;
        private String createAt;
        private String currency;
        private String deadline;
        private String deliveryAddress;
        private String deliveryDateFrom;
        private String deliveryDateTo;
        private String detail;
        private String id;
        private int inventory;
        private MerchantBean merchant;
        private String merchantId;
        private int originPrice;
        private String phone;
        private int price;
        private int sold;
        private String status;
        private String title;
        private String updateAt;
        private List<String> cover;

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCreateAt() {
            return createAt;
        }

        public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getDeadline() {
            return deadline;
        }

        public void setDeadline(String deadline) {
            this.deadline = deadline;
        }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }

        public String getDeliveryDateFrom() {
            return deliveryDateFrom;
        }

        public void setDeliveryDateFrom(String deliveryDateFrom) {
            this.deliveryDateFrom = deliveryDateFrom;
        }

        public String getDeliveryDateTo() {
            return deliveryDateTo;
        }

        public void setDeliveryDateTo(String deliveryDateTo) {
            this.deliveryDateTo = deliveryDateTo;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getInventory() {
            return inventory;
        }

        public void setInventory(int inventory) {
            this.inventory = inventory;
        }

        public MerchantBean getMerchant() {
            return merchant;
        }

        public void setMerchant(MerchantBean merchant) {
            this.merchant = merchant;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }

        public int getOriginPrice() {
            return originPrice;
        }

        public void setOriginPrice(int originPrice) {
            this.originPrice = originPrice;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSold() {
            return sold;
        }

        public void setSold(int sold) {
            this.sold = sold;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(String updateAt) {
            this.updateAt = updateAt;
        }

        public List<String> getCover() {
            return cover;
        }

        public void setCover(List<String> cover) {
            this.cover = cover;
        }

        public static class MerchantBean {
            /**
             * address : string
             * category : string
             * guide : {"gender":"string","mobile":"string","photo":["string"]}
             * id : string
             * image : string
             * info : string
             * name : string
             * phone : string
             * rating : 0
             * restaurant : {"address":"string","location":{"lat":0,"lon":0},"mobile":"string","openTime":"string","photo":["string"],"style":"string"}
             * sold : 0
             * status : string
             * type : string
             */

            private String address;
            private String category;
            private GuideBean guide;
            private String id;
            private String image;
            private String info;
            private String name;
            private String phone;
            private int rating;
            private RestaurantBean restaurant;
            private int sold;
            private String status;
            private String type;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public GuideBean getGuide() {
                return guide;
            }

            public void setGuide(GuideBean guide) {
                this.guide = guide;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }

            public RestaurantBean getRestaurant() {
                return restaurant;
            }

            public void setRestaurant(RestaurantBean restaurant) {
                this.restaurant = restaurant;
            }

            public int getSold() {
                return sold;
            }

            public void setSold(int sold) {
                this.sold = sold;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public static class GuideBean {
                /**
                 * gender : string
                 * mobile : string
                 * photo : ["string"]
                 */

                private String gender;
                private String mobile;
                private List<String> photo;

                public String getGender() {
                    return gender;
                }

                public void setGender(String gender) {
                    this.gender = gender;
                }

                public String getMobile() {
                    return mobile;
                }

                public void setMobile(String mobile) {
                    this.mobile = mobile;
                }

                public List<String> getPhoto() {
                    return photo;
                }

                public void setPhoto(List<String> photo) {
                    this.photo = photo;
                }
            }

            public static class RestaurantBean {
                /**
                 * address : string
                 * location : {"lat":0,"lon":0}
                 * mobile : string
                 * openTime : string
                 * photo : ["string"]
                 * style : string
                 */

                private String address;
                private LocationBean location;
                private String mobile;
                private String openTime;
                private String style;
                private List<String> photo;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public LocationBean getLocation() {
                    return location;
                }

                public void setLocation(LocationBean location) {
                    this.location = location;
                }

                public String getMobile() {
                    return mobile;
                }

                public void setMobile(String mobile) {
                    this.mobile = mobile;
                }

                public String getOpenTime() {
                    return openTime;
                }

                public void setOpenTime(String openTime) {
                    this.openTime = openTime;
                }

                public String getStyle() {
                    return style;
                }

                public void setStyle(String style) {
                    this.style = style;
                }

                public List<String> getPhoto() {
                    return photo;
                }

                public void setPhoto(List<String> photo) {
                    this.photo = photo;
                }

                public static class LocationBean {
                    /**
                     * lat : 0
                     * lon : 0
                     */

                    private int lat;
                    private int lon;

                    public int getLat() {
                        return lat;
                    }

                    public void setLat(int lat) {
                        this.lat = lat;
                    }

                    public int getLon() {
                        return lon;
                    }

                    public void setLon(int lon) {
                        this.lon = lon;
                    }
                }
            }
        }
    }
}
