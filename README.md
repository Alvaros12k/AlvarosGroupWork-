# Tenant Management System

An Android app for landlords to record tenants, see total rent, and call tenants.

## Features
- **Authentication**: Register and Log In screens
- **Dashboard**: Displays live count of tenants and total rent using Data Binding and ViewModel
- **Tenant Management**: Add new tenants and view all tenants persisted locally with Room Database and Coroutines
- **Actions**: Call tenant directly via system dialer, Options Menu, Navigation Drawer

## Architecture
- `ui/` – Activities, Fragments, and TenantViewModel (UI layer)
- `data/` – Tenant, TenantDao, TenantDatabase, TenantRepository (Data layer)

**Data Flow:**  
Screens → TenantViewModel (LiveData) → TenantRepository → Room Database

## Team
| Stage | Member | Admission No. | Pull request |
|---|---|---|---|
| 1 Lead | Alvaro Karanja | 000000 | https://github.com/Alvaros12k/AlvarosGroupWork-/pull/1 |
| 2 ViewModel | Alvaro Karanja | 000000 | https://github.com/Alvaros12k/AlvarosGroupWork-/pull/2 |
| 3 Room | Alvaro Karanja | 000000 | https://github.com/Alvaros12k/AlvarosGroupWork-/pull/3 |
| 4 Screens | Alvaro Karanja | 000000 | https://github.com/Alvaros12k/AlvarosGroupWork-/pull/4 |
| 5 Data integration | Alvaro Karanja | 000000 | https://github.com/Alvaros12k/AlvarosGroupWork-/pull/5 |
| 6 Release | Alvaro Karanja | 000000 | https://github.com/Alvaros12k/AlvarosGroupWork-/pull/6 |
