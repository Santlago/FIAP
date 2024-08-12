# Aula 1

```
create table pedido_novos as select * from pedido;

alter table pedido_novos add status varchar2(30);

select * from pedido_novos;
```

## Exemplo trigger
```
create or replace trigger trg_pedido
    before insert on pedido_novos
    for each row
begin
    if :new.status is null then
    :new.status := 'Novo Pedido';
    end if;
end;

insert into pedido_novos 
values (5011, 5005, 3213, 32131, 3213, sysdate, sysdate, sysdate, 400, 20, 3213, null);

select * from pedido_novos;
```

```
create table tb_auditoria
(
    id number generated always as identity,
    tabela varchar(30),
    operacao varchar(30),
    data date,
    usuario varchar(30)
)
```
```
CREATE OR REPLACE TRIGGER trg_auditoria
  AFTER INSERT OR UPDATE OR DELETE ON pedido_novos
  FOR EACH ROW
DECLARE
  operacao     VARCHAR2(30);
  nome_usuario VARCHAR2(100);
 
BEGIN
  -- Determina a operação realizada (INSERT, UPDATE ou DELETE)
  IF INSERTING THEN
    operacao := 'INSERT';
  ELSIF UPDATING THEN
    operacao := 'UPDATE';
  ELSIF DELETING THEN
    operacao := 'DELETE';
  END IF;
 
  -- Obtém o nome de usuário da sessão atual
  nome_usuario := SYS_CONTEXT('USERENV', 'SESSION_USER');
 
  -- Registra a auditoria na tabela de auditoria
  INSERT INTO TB_AUDITORIA
    (tabela, operacao, DATA, USUARIO)
  VALUES
    ('PEDIDO_NOVOS', operacao, sysdate, nome_usuario);
END;
```