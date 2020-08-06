CREATE TABLE "order"."commodity" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL,
  "name" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL,
  "address" text COLLATE "pg_catalog"."default" DEFAULT NULL,
  "price" numeric(20,4) NOT NULL DEFAULT NULL,
  "stock" numeric(20,4) NOT NULL DEFAULT NULL,
  "status" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL,
  "created_time" timestamp(6) NOT NULL DEFAULT NULL,
  "update_time" timestamp(6) NOT NULL DEFAULT NULL,
  CONSTRAINT "pk_mmodity" PRIMARY KEY ("id")
)
;

ALTER TABLE "order"."commodity"
  OWNER TO "postgres";

COMMENT ON COLUMN "order"."commodity"."id" IS 'id';

COMMENT ON COLUMN "order"."commodity"."name" IS '名称';

COMMENT ON COLUMN "order"."commodity"."address" IS '描述';

COMMENT ON COLUMN "order"."commodity"."price" IS '价格';

COMMENT ON COLUMN "order"."commodity"."stock" IS '库存';

COMMENT ON COLUMN "order"."commodity"."status" IS '状态';

COMMENT ON COLUMN "order"."commodity"."created_time" IS '创建时间';

COMMENT ON COLUMN "order"."commodity"."update_time" IS '更新时间';

COMMENT ON TABLE "order"."commodity" IS 'commodity';
