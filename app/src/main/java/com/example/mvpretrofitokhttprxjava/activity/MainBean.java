package com.example.mvpretrofitokhttprxjava.activity;

import java.util.List;

/**
 * created by JonSnow
 * on 2019/5/31
 */
public class MainBean {

        /**
         * air_now_city : {"aqi":"143","co":"1.4","main":"PM2.5","no2":"45","o3":"72","pm10":"115","pm25":"109","pub_time":"2019-06-06 10:00","qlty":"轻度污染","so2":"2"}
         * air_now_station : [{"air_sta":"万寿西宫","aqi":"178","asid":"CNA1001","co":"1.3","lat":"39.8673","lon":"116.366","main":"PM2.5","no2":"44","o3":"75","pm10":"122","pm25":"134","pub_time":"2019-06-06 10:00","qlty":"中度污染","so2":"2"},{"air_sta":"定陵","aqi":"109","asid":"CNA1002","co":"1.1","lat":"40.2865","lon":"116.17","main":"PM2.5","no2":"17","o3":"133","pm10":"92","pm25":"82","pub_time":"2019-06-06 10:00","qlty":"轻度污染","so2":"5"},{"air_sta":"东四","aqi":"163","asid":"CNA1003","co":"1.6","lat":"39.9522","lon":"116.434","main":"PM2.5","no2":"46","o3":"76","pm10":"112","pm25":"124","pub_time":"2019-06-06 10:00","qlty":"中度污染","so2":"2"},{"air_sta":"天坛","aqi":"155","asid":"CNA1004","co":"1.2","lat":"39.8745","lon":"116.434","main":"PM2.5","no2":"33","o3":"91","pm10":"91","pm25":"118","pub_time":"2019-06-06 10:00","qlty":"中度污染","so2":"2"},{"air_sta":"农展馆","aqi":"159","asid":"CNA1005","co":"1.6","lat":"39.9716","lon":"116.473","main":"PM2.5","no2":"35","o3":"96","pm10":"101","pm25":"121","pub_time":"2019-06-06 10:00","qlty":"中度污染","so2":"1"},{"air_sta":"官园","aqi":"160","asid":"CNA1006","co":"1.6","lat":"39.9425","lon":"116.361","main":"PM2.5","no2":"62","o3":"37","pm10":"123","pm25":"122","pub_time":"2019-06-06 10:00","qlty":"中度污染","so2":"2"},{"air_sta":"海淀区万柳","aqi":"109","asid":"CNA1007","co":"1.1","lat":"39.9934","lon":"116.315","main":"PM2.5","no2":"87","o3":"6","pm10":"120","pm25":"82","pub_time":"2019-06-06 10:00","qlty":"轻度污染","so2":"1"},{"air_sta":"顺义新城","aqi":"204","asid":"CNA1008","co":"1.7","lat":"40.1438","lon":"116.72","main":"PM2.5","no2":"38","o3":"63","pm10":"153","pm25":"154","pub_time":"2019-06-06 10:00","qlty":"重度污染","so2":"1"},{"air_sta":"怀柔镇","aqi":"122","asid":"CNA1009","co":"1.1","lat":"40.3937","lon":"116.644","main":"PM2.5","no2":"22","o3":"86","pm10":"131","pm25":"92","pub_time":"2019-06-06 10:00","qlty":"轻度污染","so2":"2"},{"air_sta":"昌平镇","aqi":"125","asid":"CNA1010","co":"1.1","lat":"40.1952","lon":"116.23","main":"PM2.5","no2":"19","o3":"112","pm10":"108","pm25":"95","pub_time":"2019-06-06 10:00","qlty":"轻度污染","so2":"3"},{"air_sta":"奥体中心","aqi":"159","asid":"CNA1011","co":"1.6","lat":"40.0031","lon":"116.407","main":"PM2.5","no2":"51","o3":"72","pm10":"121","pm25":"121","pub_time":"2019-06-06 10:00","qlty":"中度污染","so2":"1"},{"air_sta":"古城","aqi":"73","asid":"CNA1012","co":"1.0","lat":"39.9279","lon":"116.225","main":"-","no2":"77","o3":"10","pm10":"96","pm25":"53","pub_time":"2019-06-06 10:00","qlty":"良","so2":"1"}]
         * basic : {"admin_area":"北京","cid":"CN101010100","cnty":"中国","lat":"39.90498734","location":"北京","lon":"116.4052887","parent_city":"北京","tz":"+8.00"}
         * status : ok
         * update : {"loc":"2019-06-06 10:44","utc":"2019-06-06 02:44"}
         */

        private AirNowCityBean air_now_city;
        private BasicBean basic;
        private String status;
        private UpdateBean update;
        private List<AirNowStationBean> air_now_station;

        public AirNowCityBean getAir_now_city() {
            return air_now_city;
        }

        public void setAir_now_city(AirNowCityBean air_now_city) {
            this.air_now_city = air_now_city;
        }

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public UpdateBean getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public List<AirNowStationBean> getAir_now_station() {
            return air_now_station;
        }

        public void setAir_now_station(List<AirNowStationBean> air_now_station) {
            this.air_now_station = air_now_station;
        }

        public static class AirNowCityBean {
            /**
             * aqi : 143
             * co : 1.4
             * main : PM2.5
             * no2 : 45
             * o3 : 72
             * pm10 : 115
             * pm25 : 109
             * pub_time : 2019-06-06 10:00
             * qlty : 轻度污染
             * so2 : 2
             */

            private String aqi;
            private String co;
            private String main;
            private String no2;
            private String o3;
            private String pm10;
            private String pm25;
            private String pub_time;
            private String qlty;
            private String so2;

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getPub_time() {
                return pub_time;
            }

            public void setPub_time(String pub_time) {
                this.pub_time = pub_time;
            }

            public String getQlty() {
                return qlty;
            }

            public void setQlty(String qlty) {
                this.qlty = qlty;
            }

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }
        }

        public static class BasicBean {
            /**
             * admin_area : 北京
             * cid : CN101010100
             * cnty : 中国
             * lat : 39.90498734
             * location : 北京
             * lon : 116.4052887
             * parent_city : 北京
             * tz : +8.00
             */

            private String admin_area;
            private String cid;
            private String cnty;
            private String lat;
            private String location;
            private String lon;
            private String parent_city;
            private String tz;

            public String getAdmin_area() {
                return admin_area;
            }

            public void setAdmin_area(String admin_area) {
                this.admin_area = admin_area;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getParent_city() {
                return parent_city;
            }

            public void setParent_city(String parent_city) {
                this.parent_city = parent_city;
            }

            public String getTz() {
                return tz;
            }

            public void setTz(String tz) {
                this.tz = tz;
            }
        }

        public static class UpdateBean {
            /**
             * loc : 2019-06-06 10:44
             * utc : 2019-06-06 02:44
             */

            private String loc;
            private String utc;

            public String getLoc() {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class AirNowStationBean {
            /**
             * air_sta : 万寿西宫
             * aqi : 178
             * asid : CNA1001
             * co : 1.3
             * lat : 39.8673
             * lon : 116.366
             * main : PM2.5
             * no2 : 44
             * o3 : 75
             * pm10 : 122
             * pm25 : 134
             * pub_time : 2019-06-06 10:00
             * qlty : 中度污染
             * so2 : 2
             */

            private String air_sta;
            private String aqi;
            private String asid;
            private String co;
            private String lat;
            private String lon;
            private String main;
            private String no2;
            private String o3;
            private String pm10;
            private String pm25;
            private String pub_time;
            private String qlty;
            private String so2;

            public String getAir_sta() {
                return air_sta;
            }

            public void setAir_sta(String air_sta) {
                this.air_sta = air_sta;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getAsid() {
                return asid;
            }

            public void setAsid(String asid) {
                this.asid = asid;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getPub_time() {
                return pub_time;
            }

            public void setPub_time(String pub_time) {
                this.pub_time = pub_time;
            }

            public String getQlty() {
                return qlty;
            }

            public void setQlty(String qlty) {
                this.qlty = qlty;
            }

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }

    }


    /**
     * id : 11
     * act_logo : http://www.energy-link.com.cn/upload/admin/20180828/s_29a692567d0f0d84d515eb5cf5be98d0.jpg
     * play_time : 2018-06-10
     * name : 中国生物质能源产业联盟会员代表大会
     * province : 北京市
     * city : 西城区
     */

    /*private int id;
    private String act_logo;
    private String play_time;
    private String name;
    private String province;
    private String city;*/




   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAct_logo() {
        return act_logo;
    }

    public void setAct_logo(String act_logo) {
        this.act_logo = act_logo;
    }

    public String getPlay_time() {
        return play_time;
    }

    public void setPlay_time(String play_time) {
        this.play_time = play_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }*/

    /*@Override
    public String toString() {
        return "MainBean{" +
                "id=" + id +
                ", act_logo='" + act_logo + '\'' +
                ", play_time='" + play_time + '\'' +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }*/

    /**
     * error_code : 0
     * reason : 成功的返回
     * result : {"data":[{"author_name":"西部网","category":"军事","date":"2019-05-31 15:33","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_2_mwpm_03200403.jpg","title":"\u201c走边关·进军营\u201d媒体团爬\u201c天梯\u201d 寻访绝壁山巅的国界","uniquekey":"41cdf683dab9533396982b76529746a9","url":"http://mini.eastday.com/mobile/190531153336868.html"},{"author_name":"西部网","category":"军事","date":"2019-05-31 15:33","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190531/20190531153336_b005a35fd32811424f6776255b16137f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190531/20190531153336_b005a35fd32811424f6776255b16137f_1_mwpm_03200403.jpg","title":"戍边39年 民兵哨长凌尚前化身祖国南疆的\u201c忠诚界碑\u201d","uniquekey":"44dbe0bf7857a4c85ee2807cfcdf7988","url":"http://mini.eastday.com/mobile/190531153336571.html"},{"author_name":"东方头条 123军情观察室","category":"军事","date":"2019-05-31 15:17","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190531/2019053115_ae6834acebbd4577be2e1ca0f7de1227_2822_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190531/2019053115_a2b51beebcba4711a8ca532492fc0c6b_0227_mwpm_03200403.jpg","title":"美军要造47艘战舰，但船企流失了2万工人，能否满足海军需要？","uniquekey":"e79b9a4addaeebab7b5f9e1e33e9ba9c","url":"http://mini.eastday.com/mobile/190531151704852.html"},{"author_name":"东方头条  张殿成军情观察","category":"军事","date":"2019-05-31 15:11","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190531/2019053115_225b817273314ec68ebbe7d20b66eaa7_8857_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190531/2019053115_ead02fea54ec435b9f94a96d1120e51b_6838_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190531/2019053115_adf9570a8fa4432294504f91d3c21fe0_4363_cover_mwpm_03200403.jpg","title":"关键时刻 伊朗高层发生内讧？ 特朗普呼吁政权更迭","uniquekey":"e8e83c05c63897b5d95815e83c8fe585","url":"http://mini.eastday.com/mobile/190531151149067.html"},{"author_name":"参考消息网","category":"军事","date":"2019-05-31 14:28","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531142849_449c039d351948a6565e198696cfe799_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190531/20190531142849_d5f0120845e7697fee44ae046abbe51c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190531/20190531142849_6fba836a7af5e8fb224bf52bec0d48c8_7_mwpm_03200403.jpg","title":"英\u201c台风\u201d战机测试导弹诱饵：未来F-35或装备","uniquekey":"4fb43a7f071594204922802c9e1534a3","url":"http://mini.eastday.com/mobile/190531142849319.html"},{"author_name":"东方头条 军事亮评","category":"军事","date":"2019-05-31 14:08","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190531/2019053114_2928168934fb455dafe3ec4bbd2caf45_7964_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190531/2019053114_03de45046bce4d468091d4faa19ae829_2917_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190531/2019053114_d46960d7ee8f46e6ac0c72c9884c9b5c_6768_mwpm_03200403.jpg","title":"伊朗外长亚洲行！和美国对抗？还是\u201c服软\u201d的开始？","uniquekey":"40611facb4f3636af2874e82b1f092b2","url":"http://mini.eastday.com/mobile/190531140856352.html"},{"author_name":"参考消息网","category":"军事","date":"2019-05-31 14:08","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531140834_76a02e4a39ad89c38e02ac5564bbfeb5_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190531/20190531140834_20f1b04fdf9b73b38e58ebeb8dea3cf3_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190531/20190531140834_f2a02a7bfd1d89b64c544ed1a9f49460_2_mwpm_03200403.jpg","title":"邻邦扫描：韩军组建新快反师 韩企拿下印尼潜艇订单","uniquekey":"9c7996f001da5bf319dcd836aaa0953e","url":"http://mini.eastday.com/mobile/190531140834029.html"},{"author_name":"中国台湾网","category":"军事","date":"2019-05-31 14:08","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531140810_772584709174e9e45d96ebffe91eacb4_1_mwpm_03200403.jpg","title":"\u201c你怎么抱美国大腿都没用，最后就成为牺牲者\u201d","uniquekey":"6caa6a42f288e0a79848206f430d2d3f","url":"http://mini.eastday.com/mobile/190531140810909.html"},{"author_name":"西部网","category":"军事","date":"2019-05-31 13:54","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190531/20190531135439_fd9690011239905baf4068f902790ccf_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190531/20190531135439_fd9690011239905baf4068f902790ccf_10_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190531/20190531135439_fd9690011239905baf4068f902790ccf_4_mwpm_03200403.jpg","title":"今天，让我们重新回顾这些熟悉的名字","uniquekey":"3077ff0445d2d2d000bca604fbe9e68b","url":"http://mini.eastday.com/mobile/190531135439210.html"},{"author_name":"人民网","category":"军事","date":"2019-05-31 13:36","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531133602_363db24fa9783a6c849a98994edb9a25_1_mwpm_03200403.jpg","title":"近海穿刺 舰艇披上隐身衣","uniquekey":"780dc9303b4fdc11964f9da7b5998993","url":"http://mini.eastday.com/mobile/190531133602736.html"},{"author_name":"人民网","category":"军事","date":"2019-05-31 13:36","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190531/20190531133602_b907a7cdce531977cf94a74c53b72121_1_mwpm_03200403.jpg","title":"陆上突击 坦克加挂隐身甲","uniquekey":"84a117f89aaade362ea55f9d5542b744","url":"http://mini.eastday.com/mobile/190531133602003.html"},{"author_name":"东方头条 谷火平","category":"军事","date":"2019-05-31 12:47","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/2019053112_ad80cf97999a48b29767dcdd2e324c18_1795_mwpm_03200403.jpg","title":"90岁\u201c老爷机\u201d被复活！要战斗到2050年，飞机坟场有不少\u201c","uniquekey":"55600ef2f26fc6f68fb1d5017993980f","url":"http://mini.eastday.com/mobile/190531124727202.html"},{"author_name":"东方头条 谷火平","category":"军事","date":"2019-05-31 12:33","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190531/2019053112_ab30ae3b7ec74b869cfacc21d2872747_1540_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190531/2019053112_0dcc35ac0c9049bd822519542296711e_9040_mwpm_03200403.jpg","title":"美国到处打仗，损失惨重！有两场战争差点让美国走向\u201c破产分裂\u201d","uniquekey":"eed11d03819b55ef4de6254f1e5ca80d","url":"http://mini.eastday.com/mobile/190531123341005.html"},{"author_name":"新华网","category":"军事","date":"2019-05-31 12:14","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/20190531113659_7801b6014cd7b40cd44cd1ebf0602376_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190531/20190531113659_7801b6014cd7b40cd44cd1ebf0602376_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190531/20190531113659_7801b6014cd7b40cd44cd1ebf0602376_2_mwpm_03200403.jpg","title":"中国第17批赴黎巴嫩维和医疗分队凯旋","uniquekey":"16686fa23f7cee223f18203a92a48fcd","url":"http://mini.eastday.com/mobile/190531121410313.html"},{"author_name":"中国军网","category":"军事","date":"2019-05-31 11:59","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190531/20190531141304_c6a5b8552d2016a34195fb760d8f77ab_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190531/20190531141304_c6a5b8552d2016a34195fb760d8f77ab_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190531/20190531141304_c6a5b8552d2016a34195fb760d8f77ab_3_mwpm_03200403.jpg","title":"\u201c穿越时空\u201d对话，老英雄张富清对老连队官兵说\u2026\u2026","uniquekey":"af83cc2d043186729aa5637c0cd3a832","url":"http://mini.eastday.com/mobile/190531115942436.html"},{"author_name":"东方头条 军事亮评","category":"军事","date":"2019-05-31 11:57","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190531/2019053111_e9773a2b63bb4f4cbb6abdb3df0f181e_8914_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190531/2019053111_7efd42f5b508438dbf25456ba8610980_3979_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190531/2019053111_e0e488dd4d4c452cb2b13e683c01886d_6336_mwpm_03200403.jpg","title":"突发，美国两名高官遭遇空难，伊朗一重要人物被枪击，是巧合吗？","uniquekey":"c7cb1448f5260d4631b71359b658acc6","url":"http://mini.eastday.com/mobile/190531115733769.html"},{"author_name":"东方头条 谷火平","category":"军事","date":"2019-05-31 11:44","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/2019053111_777bc4ecd2da4038b36d9edc03088fcc_1780_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190531/2019053111_f76032cb365a4d48815178a5b3bcc176_8211_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190531/2019053111_2b1bb90be6b545709752dd197c8febe6_6343_cover_mwpm_03200403.jpg","title":"F22、F35、B2的金牌奶妈！它出现后，打击全球不是梦","uniquekey":"1a14564b71924fa009cd245b918aaf22","url":"http://mini.eastday.com/mobile/190531114420490.html"},{"author_name":"央视网","category":"军事","date":"2019-05-31 11:42","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190531/20190531114258_569effe2680a51c101064ea1ebcdd055_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190531/20190531114258_569effe2680a51c101064ea1ebcdd055_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190531/20190531114258_569effe2680a51c101064ea1ebcdd055_5_mwpm_03200403.jpg","title":"美日韩澳军舰关岛周边举行大规模海上军演落幕","uniquekey":"ad74eded81a35f6b9f65bc43a9a40d99","url":"http://mini.eastday.com/mobile/190531114258636.html"},{"author_name":"新华网","category":"军事","date":"2019-05-31 11:42","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531113700_9efebb5f77e03f2640b68a8213703b0b_1_mwpm_03200403.jpg","title":"畅想AI当\u201c边防战士\u201d","uniquekey":"fed79c31e890c36133e90270e90cf281","url":"http://mini.eastday.com/mobile/190531114232310.html"},{"author_name":"东方头条 123军情观察室","category":"军事","date":"2019-05-31 11:26","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190531/2019053111_c6df125ba8f04caaa21c3e794dcb2fdf_7773_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190531/2019053111_9f88a5250deb4e2babc3f1648946a672_6752_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190531/2019053111_cf4abc23181d43f18d2701cc3f31c8aa_0908_mwpm_03200403.jpg","title":"125毫米炮还不够！坦克仍需强化火力，140毫米火炮呼之欲出","uniquekey":"1da09c9a70421ac47e15ee27b4f6dfba","url":"http://mini.eastday.com/mobile/190531112603645.html"},{"author_name":"东方头条 利刃军事","category":"军事","date":"2019-05-31 11:17","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190531/2019053111_577105f69a4947459075fc408b856be5_5409_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190531/2019053111_063d63d836114ab2892c9dc56b61f45a_8443_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190531/2019053111_4d5881df095e4a13a33cd441b0fa0f0e_8132_mwpm_03200403.jpg","title":"战斗民族的艺术品！轰炸机变运输机 主担拉罐业务","uniquekey":"51c269361a205d8f2b5518e33a794d00","url":"http://mini.eastday.com/mobile/190531111751486.html"},{"author_name":"东方头条 阿尔法军事","category":"军事","date":"2019-05-31 11:12","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/2019053001_70939d72e66444b3b4ee5fa796c4c121_0620_mwpm_03200403.jpg","title":"美伊对抗的节骨眼上，伊朗发生蹊跷命案","uniquekey":"2933cd57ef8cad5f8e0f7bd6d154e8d1","url":"http://mini.eastday.com/mobile/190531111259331.html"},{"author_name":"东方头条 阿尔法军事","category":"军事","date":"2019-05-31 11:12","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190531/2019053023_32961d7b916f44969562eb6ecc2250cf_3433_mwpm_03200403.jpg","title":"违反军规！特朗普访日，没想到驻日美军惹身骚","uniquekey":"9dc4c102edd233a71b0449e7d6137efe","url":"http://mini.eastday.com/mobile/190531111215059.html"},{"author_name":"中国新闻网","category":"军事","date":"2019-05-31 11:12","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190531/20190531111210_02a8a110bfe949d4f56d6e2ee784b3bd_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190531/20190531111210_02a8a110bfe949d4f56d6e2ee784b3bd_2_mwpm_03200403.jpg","title":"军博部分基本陈列6月1日起开放试运行","uniquekey":"8854e8eac1c99e6de15c2080d43dcbee","url":"http://mini.eastday.com/mobile/190531111210628.html"},{"author_name":"央视网","category":"军事","date":"2019-05-31 11:06","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190531/20190531161340_2c832107a9c07c1b82c9658140132dd7_1_mwpm_03200403.jpg","title":"美军研发\u201c强化版谷歌地球\u201d：快速\u201c复制\u201d战场供军人训练","uniquekey":"aa2006dfd9ce9f7d4890b4b1fc8ca99e","url":"http://mini.eastday.com/mobile/190531110646817.html"},{"author_name":"东方头条 谷火平","category":"军事","date":"2019-05-31 10:58","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190531/2019053110_fe5fca43b95143b9868e4e1d5ae27a08_7915_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190531/2019053110_4a8c7ee299f84e44bacc0c1a51172aa9_9464_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190531/2019053110_77bb8edf13634dd3aa49bea0c55cdfa1_0775_cover_mwpm_03200403.jpg","title":"1/4的军费！特朗普推销F35，日本一掷万亿买下105架","uniquekey":"16e7c9853c7bbcb7c02edfbd8c521d17","url":"http://mini.eastday.com/mobile/190531105858530.html"},{"author_name":"法制网","category":"军事","date":"2019-05-31 10:42","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/20190531104247_753adddc3a05927079ff8bb63b45b505_1_mwpm_03200403.jpg","title":"\u201c小朋友，节日快乐\u201d","uniquekey":"8c783ac40937492394f16c2f8c81bc5c","url":"http://mini.eastday.com/mobile/190531104247048.html"},{"author_name":"人民网本地站","category":"军事","date":"2019-05-31 10:24","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190531/20190531102445_7ecd23e0c04ba22d3815ebf44a59edcd_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190531/20190531102445_2dae8ad0e903b81d9bf3e867b489d685_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190531/20190531102445_e3e494d059969107f343e3205a545a8a_5_mwpm_03200403.jpg","title":"安保执勤官兵坚守岗位护航盛会","uniquekey":"6b08953755b1cac948d7c66b69ba0bef","url":"http://mini.eastday.com/mobile/190531102445318.html"},{"author_name":"人民网","category":"军事","date":"2019-05-31 10:23","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190531/20190531102357_9818c2c4621e4291b1af3ae827dc15eb_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190531/20190531102357_9818c2c4621e4291b1af3ae827dc15eb_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190531/20190531102357_9818c2c4621e4291b1af3ae827dc15eb_2_mwpm_03200403.jpg","title":"美方称\u201c几乎肯定\u201d伊朗袭击阿联酋邮轮 伊：捏造事实","uniquekey":"7feaa140e61ae93118e9701217037c73","url":"http://mini.eastday.com/mobile/190531102357809.html"},{"author_name":"央视网","category":"军事","date":"2019-05-31 10:05","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190531/20190531114257_8b5cc0cddf6df2896fe673ec4caf97b5_1_mwpm_03200403.jpg","title":"土耳其驻美大使：将在S400防御区外部署F35战机","uniquekey":"27f45024be55af44480b4573dd786907","url":"http://mini.eastday.com/mobile/190531100522287.html"}],"stat":"1"}
     */


    /**
     * data : [{"author_name":"西部网","category":"军事","date":"2019-05-31 15:33","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_2_mwpm_03200403.jpg","title":"\u201c走边关·进军营\u201d媒体团爬\u201c天梯\u201d 寻访绝壁山巅的国界","uniquekey":"41cdf683dab9533396982b76529746a9","url":"http://mini.eastday.com/mobile/190531153336868.html"},{"author_name":"西部网","category":"军事","date":"2019-05-31 15:33","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190531/20190531153336_b005a35fd32811424f6776255b16137f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190531/20190531153336_b005a35fd32811424f6776255b16137f_1_mwpm_03200403.jpg","title":"戍边39年 民兵哨长凌尚前化身祖国南疆的\u201c忠诚界碑\u201d","uniquekey":"44dbe0bf7857a4c85ee2807cfcdf7988","url":"http://mini.eastday.com/mobile/190531153336571.html"},{"author_name":"东方头条 123军情观察室","category":"军事","date":"2019-05-31 15:17","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190531/2019053115_ae6834acebbd4577be2e1ca0f7de1227_2822_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190531/2019053115_a2b51beebcba4711a8ca532492fc0c6b_0227_mwpm_03200403.jpg","title":"美军要造47艘战舰，但船企流失了2万工人，能否满足海军需要？","uniquekey":"e79b9a4addaeebab7b5f9e1e33e9ba9c","url":"http://mini.eastday.com/mobile/190531151704852.html"},{"author_name":"东方头条  张殿成军情观察","category":"军事","date":"2019-05-31 15:11","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190531/2019053115_225b817273314ec68ebbe7d20b66eaa7_8857_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190531/2019053115_ead02fea54ec435b9f94a96d1120e51b_6838_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190531/2019053115_adf9570a8fa4432294504f91d3c21fe0_4363_cover_mwpm_03200403.jpg","title":"关键时刻 伊朗高层发生内讧？ 特朗普呼吁政权更迭","uniquekey":"e8e83c05c63897b5d95815e83c8fe585","url":"http://mini.eastday.com/mobile/190531151149067.html"},{"author_name":"参考消息网","category":"军事","date":"2019-05-31 14:28","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531142849_449c039d351948a6565e198696cfe799_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190531/20190531142849_d5f0120845e7697fee44ae046abbe51c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190531/20190531142849_6fba836a7af5e8fb224bf52bec0d48c8_7_mwpm_03200403.jpg","title":"英\u201c台风\u201d战机测试导弹诱饵：未来F-35或装备","uniquekey":"4fb43a7f071594204922802c9e1534a3","url":"http://mini.eastday.com/mobile/190531142849319.html"},{"author_name":"东方头条 军事亮评","category":"军事","date":"2019-05-31 14:08","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190531/2019053114_2928168934fb455dafe3ec4bbd2caf45_7964_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190531/2019053114_03de45046bce4d468091d4faa19ae829_2917_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190531/2019053114_d46960d7ee8f46e6ac0c72c9884c9b5c_6768_mwpm_03200403.jpg","title":"伊朗外长亚洲行！和美国对抗？还是\u201c服软\u201d的开始？","uniquekey":"40611facb4f3636af2874e82b1f092b2","url":"http://mini.eastday.com/mobile/190531140856352.html"},{"author_name":"参考消息网","category":"军事","date":"2019-05-31 14:08","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531140834_76a02e4a39ad89c38e02ac5564bbfeb5_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190531/20190531140834_20f1b04fdf9b73b38e58ebeb8dea3cf3_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190531/20190531140834_f2a02a7bfd1d89b64c544ed1a9f49460_2_mwpm_03200403.jpg","title":"邻邦扫描：韩军组建新快反师 韩企拿下印尼潜艇订单","uniquekey":"9c7996f001da5bf319dcd836aaa0953e","url":"http://mini.eastday.com/mobile/190531140834029.html"},{"author_name":"中国台湾网","category":"军事","date":"2019-05-31 14:08","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531140810_772584709174e9e45d96ebffe91eacb4_1_mwpm_03200403.jpg","title":"\u201c你怎么抱美国大腿都没用，最后就成为牺牲者\u201d","uniquekey":"6caa6a42f288e0a79848206f430d2d3f","url":"http://mini.eastday.com/mobile/190531140810909.html"},{"author_name":"西部网","category":"军事","date":"2019-05-31 13:54","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190531/20190531135439_fd9690011239905baf4068f902790ccf_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190531/20190531135439_fd9690011239905baf4068f902790ccf_10_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190531/20190531135439_fd9690011239905baf4068f902790ccf_4_mwpm_03200403.jpg","title":"今天，让我们重新回顾这些熟悉的名字","uniquekey":"3077ff0445d2d2d000bca604fbe9e68b","url":"http://mini.eastday.com/mobile/190531135439210.html"},{"author_name":"人民网","category":"军事","date":"2019-05-31 13:36","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531133602_363db24fa9783a6c849a98994edb9a25_1_mwpm_03200403.jpg","title":"近海穿刺 舰艇披上隐身衣","uniquekey":"780dc9303b4fdc11964f9da7b5998993","url":"http://mini.eastday.com/mobile/190531133602736.html"},{"author_name":"人民网","category":"军事","date":"2019-05-31 13:36","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190531/20190531133602_b907a7cdce531977cf94a74c53b72121_1_mwpm_03200403.jpg","title":"陆上突击 坦克加挂隐身甲","uniquekey":"84a117f89aaade362ea55f9d5542b744","url":"http://mini.eastday.com/mobile/190531133602003.html"},{"author_name":"东方头条 谷火平","category":"军事","date":"2019-05-31 12:47","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/2019053112_ad80cf97999a48b29767dcdd2e324c18_1795_mwpm_03200403.jpg","title":"90岁\u201c老爷机\u201d被复活！要战斗到2050年，飞机坟场有不少\u201c","uniquekey":"55600ef2f26fc6f68fb1d5017993980f","url":"http://mini.eastday.com/mobile/190531124727202.html"},{"author_name":"东方头条 谷火平","category":"军事","date":"2019-05-31 12:33","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190531/2019053112_ab30ae3b7ec74b869cfacc21d2872747_1540_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190531/2019053112_0dcc35ac0c9049bd822519542296711e_9040_mwpm_03200403.jpg","title":"美国到处打仗，损失惨重！有两场战争差点让美国走向\u201c破产分裂\u201d","uniquekey":"eed11d03819b55ef4de6254f1e5ca80d","url":"http://mini.eastday.com/mobile/190531123341005.html"},{"author_name":"新华网","category":"军事","date":"2019-05-31 12:14","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/20190531113659_7801b6014cd7b40cd44cd1ebf0602376_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190531/20190531113659_7801b6014cd7b40cd44cd1ebf0602376_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190531/20190531113659_7801b6014cd7b40cd44cd1ebf0602376_2_mwpm_03200403.jpg","title":"中国第17批赴黎巴嫩维和医疗分队凯旋","uniquekey":"16686fa23f7cee223f18203a92a48fcd","url":"http://mini.eastday.com/mobile/190531121410313.html"},{"author_name":"中国军网","category":"军事","date":"2019-05-31 11:59","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190531/20190531141304_c6a5b8552d2016a34195fb760d8f77ab_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190531/20190531141304_c6a5b8552d2016a34195fb760d8f77ab_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190531/20190531141304_c6a5b8552d2016a34195fb760d8f77ab_3_mwpm_03200403.jpg","title":"\u201c穿越时空\u201d对话，老英雄张富清对老连队官兵说\u2026\u2026","uniquekey":"af83cc2d043186729aa5637c0cd3a832","url":"http://mini.eastday.com/mobile/190531115942436.html"},{"author_name":"东方头条 军事亮评","category":"军事","date":"2019-05-31 11:57","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190531/2019053111_e9773a2b63bb4f4cbb6abdb3df0f181e_8914_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190531/2019053111_7efd42f5b508438dbf25456ba8610980_3979_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190531/2019053111_e0e488dd4d4c452cb2b13e683c01886d_6336_mwpm_03200403.jpg","title":"突发，美国两名高官遭遇空难，伊朗一重要人物被枪击，是巧合吗？","uniquekey":"c7cb1448f5260d4631b71359b658acc6","url":"http://mini.eastday.com/mobile/190531115733769.html"},{"author_name":"东方头条 谷火平","category":"军事","date":"2019-05-31 11:44","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/2019053111_777bc4ecd2da4038b36d9edc03088fcc_1780_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190531/2019053111_f76032cb365a4d48815178a5b3bcc176_8211_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190531/2019053111_2b1bb90be6b545709752dd197c8febe6_6343_cover_mwpm_03200403.jpg","title":"F22、F35、B2的金牌奶妈！它出现后，打击全球不是梦","uniquekey":"1a14564b71924fa009cd245b918aaf22","url":"http://mini.eastday.com/mobile/190531114420490.html"},{"author_name":"央视网","category":"军事","date":"2019-05-31 11:42","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190531/20190531114258_569effe2680a51c101064ea1ebcdd055_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190531/20190531114258_569effe2680a51c101064ea1ebcdd055_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190531/20190531114258_569effe2680a51c101064ea1ebcdd055_5_mwpm_03200403.jpg","title":"美日韩澳军舰关岛周边举行大规模海上军演落幕","uniquekey":"ad74eded81a35f6b9f65bc43a9a40d99","url":"http://mini.eastday.com/mobile/190531114258636.html"},{"author_name":"新华网","category":"军事","date":"2019-05-31 11:42","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/20190531113700_9efebb5f77e03f2640b68a8213703b0b_1_mwpm_03200403.jpg","title":"畅想AI当\u201c边防战士\u201d","uniquekey":"fed79c31e890c36133e90270e90cf281","url":"http://mini.eastday.com/mobile/190531114232310.html"},{"author_name":"东方头条 123军情观察室","category":"军事","date":"2019-05-31 11:26","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190531/2019053111_c6df125ba8f04caaa21c3e794dcb2fdf_7773_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190531/2019053111_9f88a5250deb4e2babc3f1648946a672_6752_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190531/2019053111_cf4abc23181d43f18d2701cc3f31c8aa_0908_mwpm_03200403.jpg","title":"125毫米炮还不够！坦克仍需强化火力，140毫米火炮呼之欲出","uniquekey":"1da09c9a70421ac47e15ee27b4f6dfba","url":"http://mini.eastday.com/mobile/190531112603645.html"},{"author_name":"东方头条 利刃军事","category":"军事","date":"2019-05-31 11:17","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190531/2019053111_577105f69a4947459075fc408b856be5_5409_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190531/2019053111_063d63d836114ab2892c9dc56b61f45a_8443_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190531/2019053111_4d5881df095e4a13a33cd441b0fa0f0e_8132_mwpm_03200403.jpg","title":"战斗民族的艺术品！轰炸机变运输机 主担拉罐业务","uniquekey":"51c269361a205d8f2b5518e33a794d00","url":"http://mini.eastday.com/mobile/190531111751486.html"},{"author_name":"东方头条 阿尔法军事","category":"军事","date":"2019-05-31 11:12","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190531/2019053001_70939d72e66444b3b4ee5fa796c4c121_0620_mwpm_03200403.jpg","title":"美伊对抗的节骨眼上，伊朗发生蹊跷命案","uniquekey":"2933cd57ef8cad5f8e0f7bd6d154e8d1","url":"http://mini.eastday.com/mobile/190531111259331.html"},{"author_name":"东方头条 阿尔法军事","category":"军事","date":"2019-05-31 11:12","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190531/2019053023_32961d7b916f44969562eb6ecc2250cf_3433_mwpm_03200403.jpg","title":"违反军规！特朗普访日，没想到驻日美军惹身骚","uniquekey":"9dc4c102edd233a71b0449e7d6137efe","url":"http://mini.eastday.com/mobile/190531111215059.html"},{"author_name":"中国新闻网","category":"军事","date":"2019-05-31 11:12","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190531/20190531111210_02a8a110bfe949d4f56d6e2ee784b3bd_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190531/20190531111210_02a8a110bfe949d4f56d6e2ee784b3bd_2_mwpm_03200403.jpg","title":"军博部分基本陈列6月1日起开放试运行","uniquekey":"8854e8eac1c99e6de15c2080d43dcbee","url":"http://mini.eastday.com/mobile/190531111210628.html"},{"author_name":"央视网","category":"军事","date":"2019-05-31 11:06","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190531/20190531161340_2c832107a9c07c1b82c9658140132dd7_1_mwpm_03200403.jpg","title":"美军研发\u201c强化版谷歌地球\u201d：快速\u201c复制\u201d战场供军人训练","uniquekey":"aa2006dfd9ce9f7d4890b4b1fc8ca99e","url":"http://mini.eastday.com/mobile/190531110646817.html"},{"author_name":"东方头条 谷火平","category":"军事","date":"2019-05-31 10:58","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190531/2019053110_fe5fca43b95143b9868e4e1d5ae27a08_7915_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190531/2019053110_4a8c7ee299f84e44bacc0c1a51172aa9_9464_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190531/2019053110_77bb8edf13634dd3aa49bea0c55cdfa1_0775_cover_mwpm_03200403.jpg","title":"1/4的军费！特朗普推销F35，日本一掷万亿买下105架","uniquekey":"16e7c9853c7bbcb7c02edfbd8c521d17","url":"http://mini.eastday.com/mobile/190531105858530.html"},{"author_name":"法制网","category":"军事","date":"2019-05-31 10:42","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190531/20190531104247_753adddc3a05927079ff8bb63b45b505_1_mwpm_03200403.jpg","title":"\u201c小朋友，节日快乐\u201d","uniquekey":"8c783ac40937492394f16c2f8c81bc5c","url":"http://mini.eastday.com/mobile/190531104247048.html"},{"author_name":"人民网本地站","category":"军事","date":"2019-05-31 10:24","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190531/20190531102445_7ecd23e0c04ba22d3815ebf44a59edcd_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190531/20190531102445_2dae8ad0e903b81d9bf3e867b489d685_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190531/20190531102445_e3e494d059969107f343e3205a545a8a_5_mwpm_03200403.jpg","title":"安保执勤官兵坚守岗位护航盛会","uniquekey":"6b08953755b1cac948d7c66b69ba0bef","url":"http://mini.eastday.com/mobile/190531102445318.html"},{"author_name":"人民网","category":"军事","date":"2019-05-31 10:23","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190531/20190531102357_9818c2c4621e4291b1af3ae827dc15eb_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190531/20190531102357_9818c2c4621e4291b1af3ae827dc15eb_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190531/20190531102357_9818c2c4621e4291b1af3ae827dc15eb_2_mwpm_03200403.jpg","title":"美方称\u201c几乎肯定\u201d伊朗袭击阿联酋邮轮 伊：捏造事实","uniquekey":"7feaa140e61ae93118e9701217037c73","url":"http://mini.eastday.com/mobile/190531102357809.html"},{"author_name":"央视网","category":"军事","date":"2019-05-31 10:05","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190531/20190531114257_8b5cc0cddf6df2896fe673ec4caf97b5_1_mwpm_03200403.jpg","title":"土耳其驻美大使：将在S400防御区外部署F35战机","uniquekey":"27f45024be55af44480b4573dd786907","url":"http://mini.eastday.com/mobile/190531100522287.html"}]
     * stat : 1
     */

   /* private String stat;
    private List<DataBean> data;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        *//**
         * author_name : 西部网
         * category : 军事
         * date : 2019-05-31 15:33
         * thumbnail_pic_s : http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_1_mwpm_03200403.jpg
         * thumbnail_pic_s02 : http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_3_mwpm_03200403.jpg
         * thumbnail_pic_s03 : http://03imgmini.eastday.com/mobile/20190531/20190531153336_e31c3c5ef7e02de56c8afaea96710c72_2_mwpm_03200403.jpg
         * title : “走边关·进军营”媒体团爬“天梯” 寻访绝壁山巅的国界
         * uniquekey : 41cdf683dab9533396982b76529746a9
         * url : http://mini.eastday.com/mobile/190531153336868.html
         *//*

        private String author_name;
        private String category;
        private String date;
        private String thumbnail_pic_s;
        private String thumbnail_pic_s02;
        private String thumbnail_pic_s03;
        private String title;
        private String uniquekey;
        private String url;

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getThumbnail_pic_s() {
            return thumbnail_pic_s;
        }

        public void setThumbnail_pic_s(String thumbnail_pic_s) {
            this.thumbnail_pic_s = thumbnail_pic_s;
        }

        public String getThumbnail_pic_s02() {
            return thumbnail_pic_s02;
        }

        public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
            this.thumbnail_pic_s02 = thumbnail_pic_s02;
        }

        public String getThumbnail_pic_s03() {
            return thumbnail_pic_s03;
        }

        public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
            this.thumbnail_pic_s03 = thumbnail_pic_s03;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUniquekey() {
            return uniquekey;
        }

        public void setUniquekey(String uniquekey) {
            this.uniquekey = uniquekey;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }*/
}



