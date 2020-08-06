CREATE TABLE "order"."order" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "user_id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "commodity_id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "number" numeric(20,4) NOT NULL DEFAULT NULL::numeric,
  "total_price" numeric(20,4) NOT NULL DEFAULT NULL::numeric,
  "status" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "created_time" timestamp(6) NOT NULL DEFAULT NULL::timestamp without time zone,
  "update_time" timestamp(6) NOT NULL DEFAULT NULL::timestamp without time zone,
  CONSTRAINT "pk_der" PRIMARY KEY ("id")
)
;

ALTER TABLE "order"."order"
  OWNER TO "postgres";

COMMENT ON COLUMN "order"."order"."id" IS '主键（uuid），传输时候带入';

COMMENT ON COLUMN "order"."order"."user_id" IS 'userId';

COMMENT ON COLUMN "order"."order"."commodity_id" IS 'commodityId';

COMMENT ON COLUMN "order"."order"."number" IS '数量';

COMMENT ON COLUMN "order"."order"."total_price" IS '总额';

COMMENT ON COLUMN "order"."order"."status" IS '状态';

COMMENT ON COLUMN "order"."order"."created_time" IS '创建时间';

COMMENT ON COLUMN "order"."order"."update_time" IS '更新时间';

COMMENT ON TABLE "order"."order" IS 'order';
