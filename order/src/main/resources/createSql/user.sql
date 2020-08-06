CREATE TABLE "user"."user" (
  "id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "login_id" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "name" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "password" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "status" varchar(32) COLLATE "pg_catalog"."default" NOT NULL DEFAULT NULL::character varying,
  "createdtime" timestamp(6) NOT NULL DEFAULT NULL::timestamp without time zone,
  "updatetime" timestamp(6) NOT NULL DEFAULT NULL::timestamp without time zone,
  CONSTRAINT "pk_er" PRIMARY KEY ("id")
)
;

ALTER TABLE "user"."user"
  OWNER TO "postgres";

COMMENT ON COLUMN "user"."user"."id" IS '主键（uuid），传输时候带入';

COMMENT ON COLUMN "user"."user"."login_id" IS 'login_id';

COMMENT ON COLUMN "user"."user"."name" IS 'name';

COMMENT ON COLUMN "user"."user"."password" IS 'password';

COMMENT ON COLUMN "user"."user"."status" IS '状态';

COMMENT ON COLUMN "user"."user"."createdtime" IS '创建时间';

COMMENT ON COLUMN "user"."user"."updatetime" IS '更新时间';

COMMENT ON TABLE "user"."user" IS 'user';
